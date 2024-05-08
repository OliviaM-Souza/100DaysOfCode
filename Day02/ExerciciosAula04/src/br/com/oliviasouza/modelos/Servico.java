package br.com.oliviasouza.modelos;

import br.com.oliviasouza.calculos.Calculavel;
import br.com.oliviasouza.calculos.Vendavel;

public class Servico implements Vendavel {
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void calculaPrecoFinal(double desconto) {
        double precoFinal = preco - (preco * desconto);
        System.out.println("Preço do serviço com desconto = " + precoFinal);
    }
}
