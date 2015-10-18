
package br.com.gameVicio.controle;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class conectabd {
    
   public static Connection conectabd() throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/game", "root", "deloam");
            JOptionPane.showMessageDialog(null, "conectado com sucesso!");
            return con;
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error);
            return null;
        }
  
    }
}
