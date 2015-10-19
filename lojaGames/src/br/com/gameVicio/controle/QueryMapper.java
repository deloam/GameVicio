/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gameVicio.controle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Deloam Kitty
 */
public interface QueryMapper {
    
    List<T> mapping(ResultSet rset) throws SQLException;
}
