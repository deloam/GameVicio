/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gameVicio.dao;

import br.com.gameVicio.modelo.cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deloam Kitty
 */
public class clienteDao {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
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
             Logger.getLogger(clienteDao.class.getName()).log(Level.SEVERE, null, ex);
         }
}
    
    
}
