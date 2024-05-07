package br.com.oliviamaria.modelos;

public class Usuario {
    private String nome;
    private int idade;
    private String eMail;
    private Livro livroEmprestado;

    public Usuario(String nome, String eMail){
        this.nome = nome;
        this.eMail = eMail;
    }

    public Usuario(String nome, int idade, String eMail){
        this(nome,eMail);
        this.idade = idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        }else {
            System.out.println("A idade deve ser um número positivo");
        }
    }

    public Livro getLivroEmprestado() {
        return livroEmprestado;
    }

    public void setLivroEmprestado(Livro livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }

    public String exibeInformacoesUsuario(){
        return """
                Nome do usuário = %s
                Idade = %d
                E-mail = %s
                """.formatted(nome, idade, eMail);
    }

}
