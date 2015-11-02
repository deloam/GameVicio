package br.com.gameVicio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ContatoDao {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void cadastrarContato(JTextField telefone, JTextField email,
         JTextField celular, JTextField dddcel,JTextField dddtel)
    {
        
    String sql = "Insert into contato(telefone,email,celular,dddCel,dddTel) values(?,?,?,?,?)";
    int i=0;
    
    try {
        pst = con.prepareStatement(sql);
        pst.setString(i++,telefone.getText());
        pst.setString(i++,email.getText());
        pst.setString(i++,celular.getText());
        pst.setString(i++,dddcel.getText());
        pst.setString(i++,dddtel.getText());
        
      
        pst.execute();
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!","Cadastro com Sucesso",JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException error) {
        JOptionPane.showMessageDialog(null, error);
    }
}
}
