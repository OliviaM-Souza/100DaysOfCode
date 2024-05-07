package br.com.oliviamaria.modelos;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private String anoDePublicacao;
    private boolean estaEmprestado = false;

    public Livro(String titulo, String autor){
        this(titulo, autor, "indefinido", "indefinido");
    }

    public Livro(String titulo, String autor, String genero, String anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoDePublicacao = anoDePublicacao;
    }

    public void setAnoDePublicacao(String anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean getEstaEmprestado(){
        return estaEmprestado;
    }

    public void setEstaEmprestado(boolean estaEmprestado){
        this.estaEmprestado = estaEmprestado;
    }

    public String exibeInformacoesLivro(){
        return """
                Título do Livro: %s
                Autor: %s
                gênero: %s
                Ano de publicação: %s
                """.formatted(titulo, autor, genero, anoDePublicacao);
    }
}
