import br.com.oliviamaria.modelos.*;
public class Main {
    public static void main(String[] args) {

        Livro novoLivro = new Livro("Percy Jackson", "Ricky Riordan");
        System.out.println(novoLivro.exibeInformacoesLivro());

        Usuario novoUsuario = new Usuario("Olívia Souza", 22, "oliviamads17@gmail.com");
        System.out.println(novoUsuario.exibeInformacoesUsuario());

        Livro novoLivro2 = new Livro("Harry Potter", "J.K.ROLLYNG", "Fantasia", "2001");
        System.out.println(novoLivro2.exibeInformacoesLivro());

        Usuario novoUsuario2 = new Usuario("Robert Gustavo", "robert.gustavo@gmail.com");
        System.out.println(novoUsuario2.exibeInformacoesUsuario());

        Biblioteca  biblioteca = new Biblioteca();
        biblioteca.emprestaLivro(novoUsuario, novoLivro2);

        biblioteca.devolveLivro(novoUsuario,novoLivro2);
    }
}