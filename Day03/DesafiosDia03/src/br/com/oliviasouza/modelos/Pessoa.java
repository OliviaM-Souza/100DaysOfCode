package br.com.oliviasouza.modelos;

public class Pessoa {
    private String nome;
    private int idade;

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " Idade: " + this.getIdade() + " | ";
    }
}
