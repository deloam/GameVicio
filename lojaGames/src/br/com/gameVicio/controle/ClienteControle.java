package br.com.gameVicio.controle;

import br.com.gameVicio.dao.ClienteDao;
import br.com.gameVicio.dao.conectabd;
import br.com.gameVicio.modelo.cliente;
import br.com.gameVicio.modelo.contato;
import br.com.gameVicio.modelo.endereco;

import br.com.gameVicio.visual.CadastroProduto;
import br.com.gameVicio.visual.cadastroCliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteControle {
    cliente cliente = new cliente();
    ClienteDao clienteDao = new ClienteDao();
    cadastroCliente cadccli = new cadastroCliente();
           Connection con;
           
    public boolean  inserirCliente (cliente cliente) throws SQLException{
        boolean ic = false;
        con = conectabd.getConnection();
        
        return ic;
    }
    
    
    
    
}
