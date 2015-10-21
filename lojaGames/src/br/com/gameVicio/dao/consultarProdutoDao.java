
package br.com.gameVicio.dao;

import br.com.gameVicio.controle.conectabd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

public class consultarProdutoDao {
     Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
   
     public void listarProdutos(JTable tabela) throws SQLException{
         con = conectabd.getConnection();
        String sql = "select * from produto order by id Asc";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tabela.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null,error);
        }
    }
    
    public void pesquisarUsuarios(JTextField pesquisa,JTable tabela) throws SQLException{
        con = conectabd.getConnection();
        String sql = "Select * from produto where upper(nome) LIKE upper(?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,pesquisa.getText()+"%");
            rs = pst.executeQuery();
            tabela.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro);
        }
    }
}
