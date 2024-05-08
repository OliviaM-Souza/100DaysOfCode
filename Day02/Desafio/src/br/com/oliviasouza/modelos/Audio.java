package br.com.oliviasouza.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int curtidas;
    protected int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas(){
        return curtidas;
    }

    public void reproduzir(){
        totalDeReproducoes++;
    }

    public void curtir(){
        curtidas++;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
