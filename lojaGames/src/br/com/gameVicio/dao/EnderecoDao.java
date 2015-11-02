package br.com.gameVicio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EnderecoDao {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void cadastrarEndereco(JTextField Endereco, JTextField numero
         ,JTextField cidade, JComboBox estado,JTextField cep, JTextField complemento){
        
    String sql = "Insert into endereco (logradouro,numero,cidade,estado,cep,complemento) values(?,?,?,?,?,?)";
    int i=0;
    
    try {
        pst = con.prepareStatement(sql);
        pst.setString(i++,Endereco.getText());
        pst.setString(i++,numero.getText());
        pst.setString(i++,cidade.getText());
        pst.setString(i++,estado.getSelectedItem().toString());
        pst.setInt(i++, Integer.parseInt(cep.getText()));
        pst.setString(i++,complemento.getText());
      
        pst.execute();
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!","Cadastro com Sucesso",JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException error) {
        JOptionPane.showMessageDialog(null, error);
    }
}
}
