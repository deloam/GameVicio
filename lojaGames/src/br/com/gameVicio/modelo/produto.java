/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gameVicio.modelo;

/**
 *
 * @author Deloam Kitty
 */
public class produto {
    private String nome;
    private String classificacao;
    private String setor;
    private String data;
    private int lote;
    private int preco;

    public String getNome() {
        return nome;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public String getSetor() {
        return setor;
    }

    public String getData() {
        return data;
    }

    public int getLote() {
        return lote;
    }

    public int getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
