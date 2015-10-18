/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Deloam Kitty
 */
public class contato {
    private String email;
    private String telefone;
    private String celular;

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
       StringBuilder builder = new StringBuilder();
       builder.append("Contato [ email= ")
               .append(email)
               .append(", telefone= ")
               .append(telefone)
               .append(", celular= ")
               .append(celular)
               .append(" ]");
       return builder.toString();
    }

    
    
}
