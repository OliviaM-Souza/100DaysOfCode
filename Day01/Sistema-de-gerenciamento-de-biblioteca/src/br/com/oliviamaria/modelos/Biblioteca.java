package br.com.oliviamaria.modelos;

public class Biblioteca {

    public void emprestaLivro(Usuario usuario, Livro livro){
        if(usuario.getLivroEmprestado() != null){
            System.out.println("O usuário já possui um livro emprestado: \n" + usuario.getLivroEmprestado().exibeInformacoesLivro());
        }else{
            if(livro.getEstaEmprestado()){
                System.out.println("Não é possível realizar esta ação, o livro já está locado");
            }else{
                livro.setEstaEmprestado(true);
                usuario.setLivroEmprestado(livro);
                System.out.println("Livro emprestado com sucesso");
            }
        }
    }

    public void devolveLivro(Usuario usuario, Livro livro){
        if (usuario.getLivroEmprestado() == null){
            System.out.println("O usuário não possui empréstimo pendente");
        }else{
            if(livro != usuario.getLivroEmprestado()){
                System.out.println("Este não é o livro correto para devolução!");
            }else{
                usuario.setLivroEmprestado(null);
                livro.setEstaEmprestado(false);
                System.out.println("Livro devolvido com sucesso");
            }
        }
    }
}
