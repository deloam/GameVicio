package br.com.gameVicio.dao;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conectabd {
   public static ThreadLocal<Connection> conth = new ThreadLocal<Connection>();
   
   public static Connection getConnection() throws SQLException{
       Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/game", "root", "deloam");
            System.out.println("conectado com sucesso!");
            return con;
        } catch (ClassNotFoundException error) {
            JOptionPane.showMessageDialog(null, error);
            return null;
        }
  
    }
   
   public void iniciaTransition() throws SQLException {
		if (isTransactionStarted()) return; //fornecer suporte para a propagação de transação
		Connection con = getConnection();
		con.setAutoCommit(false);
		conth.set(con);
	}
	
	private boolean isTransactionStarted () {
		return ( conth.get() != null );
	}
	
	public void endTransation() throws SQLException {
		commit(getConnectionFromConth());
		fecharTransation();
	}

	public void fecharTransation() throws SQLException {
		Connection con = getConnectionFromConth();
		fecharConnect(con);
		conth.remove();
	}

	public void rollbackTransation() {
		Connection con;
		try {
			con = getConnectionFromConth();
			rollback(con);
			fecharConnect(con);
		} catch (SQLException e) {
		}

		conth.remove();
	}

	public void commit(Connection con) throws SQLException {
		con.commit();
	}

	public void rollback(Connection con) throws SQLException {
		if (con != null)
			con.rollback();
	}

	public Connection getConnectionFromConth() throws SQLException {
		Connection con = conth.get();
		if (con == null) throw new SQLException("Transação invalida");
		if (con.isClosed()) throw new SQLException("Transação invalida, Conexao esta fechada");
		return con;
	}

	public long executePreparedUpdateAndReturnGeneratedKeys(Connection con, String query , Object... params) throws SQLException {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		long result = 0l;
		try {
			pstmt = con.prepareStatement(query,
					PreparedStatement.RETURN_GENERATED_KEYS);
			int i = 0;
			for (Object param : params) {
				pstmt.setObject(++i, param);
			}

			pstmt.executeUpdate();

			rset = pstmt.getGeneratedKeys();

			if (rset.next())
				result = rset.getLong(1);

		} finally {
			fecharStmt(pstmt);
			fecharRset(rset);
		}
		return result;
	}

	public void executePreparedUpdate(Connection con, String query,
			Object... params) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(query);
			int i = 0;
			for (Object param : params) {
				pstmt.setObject(++i, param);
			}
			pstmt.executeUpdate();
		} finally {
			fecharStmt(pstmt);
		}
	}
	
	public void executePreparedUpdateIntoSingleTransaction ( String query, Object... params) throws SQLException {
		executePreparedUpdate(getConnection(), query, params);
	}

	public void executePreparedUpdate( String query, Object... params) throws SQLException {
		executePreparedUpdate(getConnectionFromConth(), query, params);
	}


	public void fecharStmt(Statement stmt) {
		if (stmt == null) return;
		try {
			stmt.close();
		} catch (SQLException e) {
		}
	}

	public void fecharConnect(Connection conn) {

		if (conn == null) return;
		try {
			conn.close();
		} catch (SQLException e) {
		}

	}

	public void fecharRset(ResultSet rset) {
		if (rset == null) return;
		try {
			rset.close();
		} catch (SQLException e) {
		}
	}

	public void fecharConnectStmt(Connection conn, Statement stmt) {
		fecharStmt(stmt);
		fecharConnect(conn);
	}

	public void fecharTudo(Connection conn, Statement stmt, ResultSet rset) {
		fecharRset(rset);
		fecharConnectStmt(conn, stmt);
	}

}
