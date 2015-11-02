package br.com.gameVicio.dao;

import br.com.gameVicio.modelo.cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

public class ClienteDao {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
       public void listarClientes(JTable tabela) throws SQLException{
         con = conectabd.getConnection();
        String sql = "select * from clientes order by id Asc";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tabela.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null,error);
        }
    }
    
    
      public void pesquisarFiltro(JTextField pesquisa,JTable tabela,JComboBox sel) throws SQLException{
        String seletc;
        switch (sel.getSelectedIndex()) {
            case 0:
                seletc = "nome";
                break;
            case 1:
                seletc = "dataNasc";
                break;
            case 2:
                seletc = "cpf";
                break;
            case 3:
                seletc = "sexo";
                break;
            default:
                seletc = "nome";
        }
        con = conectabd.getConnection();
        String sql = "Select * from clientes where upper("+seletc+") LIKE upper(?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,pesquisa.getText()+"%");
            rs = pst.executeQuery();
            tabela.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro);
        }
    }

       public void inserirCliente(cliente cliente) throws SQLException{
        con = conectabd.getConnection();
        int i = 0;
        String sql = "insert into clientes (nome, dataNasc, cpf, sexo, endereco, contato)"
                + " values (?,?,?,?,?,?)";
         try {
             pst = con.prepareStatement(sql);
             pst.setString(++i, cliente.getNome() );
             pst.setString(++i, cliente.getDataNasc());
             pst.setString(++i, cliente.getCpf());
             pst.setString(++i, cliente.getSexo().toString());
             pst.setString(++i, cliente.getEndereco().toString());
             pst.setString(++i, cliente.getContato().toString());
             pst.executeUpdate();
             con.close();
             pst.close();
             
         } catch (SQLException ex) {
             Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
         }
}
}
