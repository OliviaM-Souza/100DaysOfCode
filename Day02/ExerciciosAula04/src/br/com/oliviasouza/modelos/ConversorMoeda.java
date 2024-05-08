package br.com.oliviasouza.modelos;

import br.com.oliviasouza.calculos.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double dolar) {
        double cotacaoDolar = 5.10;
        return  dolar * cotacaoDolar;
    }
}
