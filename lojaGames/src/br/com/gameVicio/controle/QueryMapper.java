package br.com.gameVicio.controle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface QueryMapper<T> {
    
    List<T> mapping(ResultSet rset) throws SQLException;
}
