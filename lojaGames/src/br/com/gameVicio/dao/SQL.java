
package br.com.gameVicio.dao;

import br.com.gameVicio.controle.conectabd;
import br.com.gameVicio.modelo.cliente;
import br.com.gameVicio.visual.janelaPrinc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import sun.awt.windows.ThemeReader;
public class SQL {
     Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void Logar(JTextField login,JPasswordField senha) throws SQLException{

       con = conectabd.getConnection();
       
        String sql = "Select * from login where usuario = ? and senha= ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,login.getText());
            pst.setString(2, senha.getText());
            
            rs = pst.executeQuery();
            
            if(rs.next()){
                janelaPrinc frm = new janelaPrinc();
                frm.setVisible(true);        
            }else{
                JOptionPane.showMessageDialog(null,"Usuario e senha Inválidos");
            }
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error);
        }
       
    }


    public void inserir(cliente cliente) throws SQLException{
        con = conectabd.getConnection();
        int i = 0;
        String sql = "insert into clientes (nome, dataNasc, cpf, sexo, endereco, contato) values (?,?,?,?,?,?)";
         try {
             pst = con.prepareStatement(sql);
             pst.setString(++i, cliente.getNome() );
             pst.setString(++i, cliente.getDataNasc());
             pst.setString(++i, cliente.getCpf());
             pst.setString(++i, cliente.getSexo().toString());
             pst.setString(++i, cliente.getEndereco().toString());
             pst.setString(++i, cliente.getContato().toString());
             pst.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
         }
}
}