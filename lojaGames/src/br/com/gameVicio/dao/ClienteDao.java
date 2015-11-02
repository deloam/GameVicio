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

       public void inserirCliente(JTextField nome, JTextField nasc
         ,JTextField cpf, JComboBox sexo,int end, int contato) throws SQLException{
        con = conectabd.getConnection();
        int i = 0;
        String sx = null;
        String sql = "insert into clientes (nome, dataNasc, cpf, sexo, endereco, contato)"
                + " values (?,?,?,?,?,?)";
        if (sexo.getSelectedIndex() == 2){
            sx = "m";
        }else if (sexo.getSelectedIndex() == 3){
            sx = "f";
        }
         try {
             pst = con.prepareStatement(sql);
             pst.setString(++i, nome.getText() );
             pst.setString(++i, nasc.getText() );
             pst.setString(++i, cpf.getText() );
             pst.setString(++i, sx );
             pst.setInt(i++,end);
             pst.setInt(i++,contato);
             pst.executeUpdate();
             con.close();
             pst.close();
             
         } catch (SQLException ex) {
             Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
         }
}
}
