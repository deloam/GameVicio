package br.com.gameVicio.dao;

import br.com.gameVicio.modelo.cliente;
import br.com.gameVicio.modelo.contato;
import br.com.gameVicio.modelo.endereco;
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

       public void inserirCliente(cliente cc,endereco end,contato conc) throws SQLException{
        con = conectabd.getConnection();
        int i = 0;
        String sx = null;
        String sql = "INSERT INTO `game`.`clientes` (`nome`, `dataNasc`, `cpf`, `sexo`, "
             + "`logradouro`, `numero_casa`, `cidade`, `estado`, `cep`, `complemento`, "
             + "`email`, `telefone`, `dddtel`, `celular`, `dddcel`) "
             + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
         try {
             pst = con.prepareStatement(sql);
             pst.setString(++i, cc.getNome());
             pst.setString(++i, cc.getDataNasc());
             pst.setString(++i, cc.getCpf() );
             pst.setString(++i, cc.getSexo().toString() );
             pst.setString(++i, end.getLogradouro());
             pst.setInt   (++i, end.getNumero() );
             pst.setString(++i, end.getCidade());
             pst.setString(++i, end.getEstado());
             pst.setInt   (++i, end.getCep());
             pst.setString(++i, end.getComplemento());
             pst.setString(++i, conc.getEmail());
             pst.setString(++i, conc.getTelefone());
             pst.setString(i++,conc.getTelefone().substring(0, 1));
             pst.setString(++i, conc.getCelular());
             pst.setString(i++,conc.getCelular().substring(0, 1));
             pst.executeUpdate();
             con.close();
             pst.close();
             
         } catch (SQLException ex) {
             Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
         }
}
}
