package br.com.gameVicio.dao;

import br.com.gameVicio.modelo.produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

public class produtoDao {
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
    
    public void pesquisarFiltro(JTextField pesquisa,JTable tabela,JComboBox sel) throws SQLException{
        String seletc;
        switch (sel.getSelectedIndex()) {
            case 0:
                seletc = "nome";
                break;
            case 1:
                seletc = "setor";
                break;
            case 2:
                seletc = "lote";
                break;
            case 3:
                seletc = "preco";
                break;
            case 4:
                seletc = "classificacao";
                break;
            case 5:
                seletc = "dataChegada";
                break;
            default:
                seletc = "nome";
        }
        con = conectabd.getConnection();
        String sql = "Select * from produto where upper("+seletc+") LIKE upper(?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,pesquisa.getText()+"%");
            rs = pst.executeQuery();
            tabela.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro);
        }
    }
    
    public void mostarProduto(JTable tabela, JTextField cod,JTextField nome,
         JTextField lote,JTextField preco, JTextField data,JComboBox classificacao, JComboBox setor){
         int seleciona = tabela.getSelectedRow();
        cod.setText(tabela.getModel().getValueAt(seleciona, 0).toString());
        nome.setText(tabela.getModel().getValueAt(seleciona,1).toString());
        lote.setText(tabela.getModel().getValueAt(seleciona,4).toString());
        preco.setText(tabela.getModel().getValueAt(seleciona,5).toString());
        data.setText(tabela.getModel().getValueAt(seleciona,6).toString());
        classificacao.setSelectedItem(tabela.getModel().getValueAt(seleciona, 2));
        setor.setSelectedItem(tabela.getModel().getValueAt(seleciona,3));
    }
    
    public void deletarProduto(JTextField codigo) throws SQLException{
        String sql = "Delete from produto where id = ?";
        con = conectabd.getConnection();
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(codigo.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Deletado com sucesso!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro);
        }
    }

    public void editarProduto(JTextField codigo, JTextField nome, JTextField lote,
          String preco, String data, JComboBox classificacao, JComboBox setor) throws SQLException{
        String sql = "Update produto set nome = ?, setor = ?, lote = ?, preco = ?, classificacao = ?, dataChegada = ? where id = ?";
        // (nome, setor, lote, preco, classificacao, dataChegada)]
        con = conectabd.getConnection();
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,nome.getText());
            pst.setString(2,setor.getSelectedItem().toString());
            pst.setInt(3,Integer.parseInt(lote.getText()));
            pst.setInt(4,Integer.parseInt(preco));
            pst.setString(5, classificacao.getSelectedItem().toString());
            pst.setString(6, data);
            pst.setInt(7,Integer.parseInt(codigo.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cadastro atualizado com sucesso!");
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }
    
    public void cadastrarProduto(produto cc) throws SQLException{    
        int i = 0;
        con = conectabd.getConnection();
        String sql = "INSERT INTO game.produto (nome, setor, lote, preco, classificacao, dataChegada)"
             + "VALUES (?, ?, ?, ?, ?, ?)";
        

         try {
            pst = con.prepareStatement(sql);
            pst.setString(++i, cc.getNome());
            pst.setString(++i, cc.getSetor());
            pst.setInt   (++i, cc.getLote());
            pst.setInt   (++i, cc.getPreco());
            pst.setString(++i, cc.getClassificacao());
            pst.setString(++i, cc.getData());
            pst.execute(); 
             JOptionPane.showMessageDialog(null, "Cadastrado com sucecsso!");
         } catch (SQLException ex) {
             Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
         }
}

}
