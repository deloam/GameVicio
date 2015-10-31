package br.com.gameVicio.modelo;

public enum sexo {
    
     M ("Masculino"),
     F ("Feminino");
    
    private String descricao;
    
    private sexo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
