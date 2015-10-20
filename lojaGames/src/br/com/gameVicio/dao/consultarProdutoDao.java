/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gameVicio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Deloam Kitty
 */
public class consultarProdutoDao {
     Connection conecta;
    PreparedStatement pst;
    ResultSet rs;
    
    
     public void listarProdutos(JTable tabela){
        String sql = "select *from produto order by id Asc";
        try {
            pst = conecta.prepareStatement(sql);
            rs = pst.executeQuery();
            tabela.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null,error);
        }
    }
    
    public void pesquisarUsuarios(JTextField pesquisa,JTable tabela){
        String sql = "Select * from produto where upper(nome) LIKE upper(?)";
        try {
            pst = conecta.prepareStatement(sql);
            pst.setString(1,pesquisa.getText()+"%");
            rs = pst.executeQuery();
            tabela.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro);
        }
    }
}
