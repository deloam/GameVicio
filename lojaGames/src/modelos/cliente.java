/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import sun.util.calendar.BaseCalendar.Date;



/**
 *
 * @author Deloam Kitty
 */
public class cliente {
    long id;
    String nome;
    Date dataNasc;
    String cpf;
    
    sexo sexo;
    
    endereco endereco;
    
    contato contato;

    public cliente(long id, String nome, Date dataNasc, String cpf, sexo sexo, endereco endereco, contato contato) {
        super();
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
        this.contato = contato;
    }

    public cliente(long id, String nome, Date dataNasc, String cpf, sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public cliente(String nome, Date dataNasc, String cpf, sexo sexo, endereco endereco, contato contato) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
        this.contato = contato;
    }

    public cliente(String nome, Date dataNasc, sexo sexo) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
    }
    
    
}
