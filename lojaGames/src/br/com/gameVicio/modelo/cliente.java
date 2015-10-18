/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gameVicio.modelo;

import java.util.Objects;
import sun.util.calendar.BaseCalendar.Date;



/**
 *
 * @author Deloam Kitty
 */
public class cliente {
    private long id;
    private String nome;
    private Date dataNasc;
    private String cpf;
    
    private sexo sexo;
    
    private endereco endereco;
    
    private contato contato;

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

    public cliente() {
    }
    
    

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public sexo getSexo() {
        return sexo;
    }

    public endereco getEndereco() {
        return endereco;
    }

    public contato getContato() {
        return contato;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(sexo sexo) {
        this.sexo = sexo;
    }

    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }

    public void setContato(contato contato) {
        this.contato = contato;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + Objects.hashCode(this.dataNasc);
        hash = 83 * hash + Objects.hashCode(this.cpf);
        hash = 83 * hash + Objects.hashCode(this.sexo);
        hash = 83 * hash + Objects.hashCode(this.endereco);
        hash = 83 * hash + Objects.hashCode(this.contato);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final cliente other = (cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.dataNasc, other.dataNasc)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return Objects.equals(this.contato, other.contato);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
       builder.append("cliente [ id= ")
               .append(id)
               .append(", nome= ")
               .append(nome)
               .append(", data de nascimento= ")
               .append(dataNasc)
               .append(", cpf= ")
               .append(cpf)
               .append(",sexo= ")
               .append(sexo)
               .append(", endereco= ")
               .append(endereco)
               .append(", contato= ")
               .append(contato)
               .append(" ]");
       return builder.toString();
    }
    
    
}
