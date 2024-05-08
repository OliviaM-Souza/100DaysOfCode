package br.com.oliviasouza.modelos;
import br.com.oliviasouza.calculos.ConversorTemperatura;

public class ConversaoTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double temperaturaFahrenheit = celsius * 1.8 + 32;
        System.out.println("Temperatura em Fahrenheit = " + temperaturaFahrenheit);
    }

    @Override
    public void FahrenheitParaCelsius(double fahrenheit) {
        double temperaturaCelsius = (fahrenheit - 32)/1.8;
        System.out.println("Temperatura em Celsius = " + temperaturaCelsius );
    }
}
