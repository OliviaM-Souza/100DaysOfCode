package br.com.oliviasouza.modelos;
import br.com.oliviasouza.calculos.Calculavel;

public class Livro implements Calculavel {
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.75;
    }
}
