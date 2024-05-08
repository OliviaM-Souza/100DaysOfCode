package br.com.oliviasouza.modelos;

import br.com.oliviasouza.calculos.Vendavel;

public class Produto implements Vendavel {
    private double preco;
    private int quantidade;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this. preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void calculaPrecoFinal(double desconto) {
        double precoFinal = (preco * quantidade) - (preco * quantidade) * desconto;
        System.out.println("Preço final do produto = " + precoFinal);
    }
}
