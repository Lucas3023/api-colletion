package com.br.collection;

public class Preco {

    double valorCustos;
    double valorImpostos;
    double valorLucro;
    double precoVenda;
    String tipoProduto;

    void definirTipoProduto(TipoProduto tipoProduto){
        this.tipoProduto = tipoProduto.getTipo();
    }
}




