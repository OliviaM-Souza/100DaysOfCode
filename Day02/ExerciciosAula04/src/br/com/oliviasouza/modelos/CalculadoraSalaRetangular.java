package br.com.oliviasouza.modelos;
import br.com.oliviasouza.calculos.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double altura;
    private double largura;

    public CalculadoraSalaRetangular(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public void calcularArea() {
        double area = altura * largura;
        System.out.println("Área = " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * (altura + largura);
        System.out.println("Perimetro = " + perimetro);
    }
}
