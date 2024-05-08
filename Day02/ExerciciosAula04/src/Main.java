import br.com.oliviasouza.modelos.*;
public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        System.out.printf("R$ %.2f \n", conversor.converterDolarParaReal(10.87));

        CalculadoraSalaRetangular calcula = new CalculadoraSalaRetangular(2, 10);
        calcula.calcularArea();
        calcula.calcularPerimetro();

        TabuadaMultiplicacao tabuada4 = new TabuadaMultiplicacao();
        tabuada4.mostrarTabuada(4);

        ConversaoTemperaturaPadrao converte = new ConversaoTemperaturaPadrao();
        converte.celsiusParaFahrenheit(32);
        converte.FahrenheitParaCelsius(165);

        Livro livro = new Livro();
        livro.setPreco(34);
        System.out.println(livro.calcularPrecoFinal());

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPreco(100);
        System.out.println(produtoFisico.calcularPrecoFinal());

        Produto produtoNovo = new Produto();
        produtoNovo.setPreco(25);
        produtoNovo.setQuantidade(4);
        produtoNovo.calculaPrecoFinal(0.20);

        Servico servicoNovo = new Servico();
        servicoNovo.setPreco(200);
        servicoNovo.calculaPrecoFinal(0.50);
    }
}