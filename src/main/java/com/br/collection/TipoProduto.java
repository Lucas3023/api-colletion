package com.br.collection;

public enum TipoProduto {


    FISICO("Fisico"),
    DIGITAL("Digital");



    TipoProduto(String tipo) {
        this.tipo = tipo;
    }

    private String tipo;

    public String getTipo() {
        return tipo;
    }
}
