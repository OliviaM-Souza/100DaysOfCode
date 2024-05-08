package br.com.oliviasouza.modelos;
import br.com.oliviasouza.calculos.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    public void mostrarTabuada(int numero){
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + i*numero);
        }
    }
}
