
package br.com.gameVicio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class SQL {
    
     Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void Logar(JTextField login,JPasswordField senha){
        
    
       
        String sql = "Select * from users where nomeUser = ? and senhaUser = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,login.getText());
            pst.setString(2, senha.getText());
            
            rs = pst.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"ok!");
            }else{
                JOptionPane.showMessageDialog(null,"Usuario e senha Inválidos");
            }
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error);
        }
    }
}
