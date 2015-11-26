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

    public ClienteDao() {
        try {
            this.con = conectabd.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //test
    public void listarClientes(JTable tabela) throws SQLException{
         con = conectabd.getConnection();
        String sql = "select id,cpf,nome,sexo,dataNasc from clientes order by id Asc";
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
        String sql = "Select id,cpf,nome,sexo,dataNasc from clientes where upper("+seletc+") LIKE upper(?)";
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
        
            
        int i = 0;
        String sql = "INSERT INTO game.clientes (nome, dataNasc, cpf, sexo, "
             + "logradouro, numero_casa, cidade, estado, cep, complemento, "
             + "email, telefone, dddtel, celular, dddcel,bairro) "
             + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
         try {
             pst = con.prepareStatement(sql);
             pst.setString(++i, cc.getNome());
             pst.setString(++i, cc.getDataNasc());
             pst.setString(++i, cc.getCpf() );
             pst.setString(++i, cc.getSexo() );
             pst.setString(++i, end.getLogradouro());
             pst.setString(++i, end.getNumero() );
             pst.setString(++i, end.getCidade());
             pst.setString(++i, end.getEstado());
             pst.setInt   (++i, end.getCep());
             pst.setString(++i, end.getComplemento());
             pst.setString(++i, conc.getEmail());
             pst.setString(++i, conc.getTelefone().substring(2));
             pst.setString(++i,conc.getTelefone().substring(0, 2));
             pst.setString(++i, conc.getCelular().substring(2));
             pst.setString(++i,conc.getCelular().substring(0, 2));
             pst.setString(++i, end.getBairro());
             pst.execute(); 
             JOptionPane.showMessageDialog(null, "Cadastrado com sucecsso!");
         } catch (SQLException ex) {
             Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
         }
}

    public void mostarClientes(JTable tabela,JTextField cpf,JTextField nome,
         JComboBox sexo, JTextField data,JTextField cod ){
         int seleciona = tabela.getSelectedRow();
         String sx;
         cod.setText(tabela.getModel().getValueAt(seleciona,0).toString());
        cpf.setText(tabela.getModel().getValueAt(seleciona, 1).toString());
        nome.setText(tabela.getModel().getValueAt(seleciona,2).toString());
        
        if (tabela.getModel().getValueAt(seleciona,3).toString().equalsIgnoreCase("f")){
           sx = "Feminino";
        } else {
            sx = "Masculino";
        }
        sexo.setSelectedItem(sx);
        
        data.setText(tabela.getModel().getValueAt(seleciona,4).toString());
        
        
     
    }

    public void mostarContts (JTextField cod,JTextField email, JTextField dddcel,
         JTextField celular,JTextField telefone,JTextField dddtel,
         JTextField logra, JTextField numero, JTextField comple, JComboBox uf,JTextField cidade,JTextField cep,JTextField bairro) throws SQLException {
         
        con = conectabd.getConnection();
        String sql = "SELECT email,telefone,dddtel,celular,dddcel"
             + ",logradouro,numero_casa,cidade,estado,cep,complemento,bairro FROM game.clientes WHERE id = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(cod.getText()));
            
            rs = (ResultSet)pst.executeQuery();
            if(rs != null) {  
                while(rs.next()) {  
              
            email.setText(rs.getString("email"));
            telefone.setText(rs.getString("telefone"));
            dddtel.setText(rs.getString("dddtel"));
            celular.setText(rs.getString("celular"));
            dddcel.setText(rs.getString("dddcel"));
            //////////////////////////////////////
            logra.setText(rs.getString("logradouro"));
            numero.setText(rs.getString("numero_casa"));
            comple.setText(rs.getString("complemento"));
            cidade.setText(rs.getString("cidade"));
            uf.setSelectedItem(rs.getString("estado"));
            cep.setText(rs.getString("cep"));
            bairro.setText(rs.getString("bairro"));
              }  
            }  
            
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null,error);
        }
    }

     public void editarCliente(JTextField codigo, JTextField nome, JTextField dataNasc, JTextField cpf,
          JComboBox sexo, JTextField logra,JTextField numend, JTextField cidade, JComboBox uf, JTextField cep,
          JTextField complemento, JTextField email,JTextField telefone,JTextField dddtel, JTextField celular
     ,JTextField dddcel,JTextField bairro) throws SQLException{
        String sql = "UPDATE clientes SET nome= ?, dataNasc = ?, cpf = ?, sexo = ?, logradouro = ?,"
             + " numero_casa = ?, cidade = ?, estado = ?, cep = ?, complemento = ?, email = ?, telefone= ?, "
             + "dddtel = ?, celular = ?, dddcel = ?, bairro = ? WHERE id = ?";
        // (nome, setor, lote, preco, classificacao, dataChegada)]
        con = conectabd.getConnection();
        int i = 0;
        String sx = "";
        if (sexo.getSelectedItem().toString().equalsIgnoreCase("Feminino")){
            sx = "f";
        }else{
            sx = "m";
        }
        try {
            pst = con.prepareStatement(sql);
            pst.setString(++i,nome.getText());
            pst.setString(++i, dataNasc.getText());
            pst.setString(++i, cpf.getText());
            pst.setString(++i, sx);
            pst.setString(++i, logra.getText());
            pst.setString(++i, numend.getText());
            pst.setString(++i, cidade.getText());
            pst.setString(++i, uf.getSelectedItem().toString() );
            pst.setInt   (++i, Integer.parseInt(cep.getText()));
            pst.setString(++i, complemento.getText());
            pst.setString(++i, email.getText());
            pst.setString(++i, telefone.getText());
            pst.setString(++i, dddtel.getText());
            pst.setString(++i, celular.getText());
            pst.setString(++i, dddcel.getText());
            pst.setString(++i, bairro.getText());
            pst.setInt   (++i, Integer.parseInt(codigo.getText()));   
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cadastro atualizado com sucesso!");
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }
     
     public void deletarcliente(JTextField codigo) throws SQLException{
        String sql = "Delete from clientes where id = ?";
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
}
