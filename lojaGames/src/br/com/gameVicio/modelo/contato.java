package br.com.gameVicio.modelo;

import java.util.Objects;

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
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.email);
        hash = 23 * hash + Objects.hashCode(this.telefone);
        hash = 23 * hash + Objects.hashCode(this.celular);
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
        final contato other = (contato) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        return true;
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
