import br.com.oliviasouza.modelos.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Olívia Souza");
        pessoa01.setIdade(22);

        Pessoa pessoa02 = new Pessoa();
        pessoa02.setNome("Gustavo Assis");
        pessoa02.setIdade(23);

        Pessoa pessoa03 = new Pessoa();
        pessoa03.setNome("Robert Gustavo");
        pessoa03.setIdade(21);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa01);
        listaDePessoas.add(pessoa02);
        listaDePessoas.add(pessoa03);

        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas);
    }
}