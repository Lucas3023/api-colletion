package com.br.collection;

public class Produto {

    void definirPreco(Preco preco, double percentualImposto,
                      double margemLucro){
        preco.valorImpostos = preco.valorCustos
                * (percentualImposto / 100);
    }

}
