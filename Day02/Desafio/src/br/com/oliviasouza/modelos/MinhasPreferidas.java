package br.com.oliviasouza.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " entrou para sua lista de favoritos do momento");
        } else {
            System.out.println("Conheça o aúdio " + audio.getTitulo());
        }
    }
}
