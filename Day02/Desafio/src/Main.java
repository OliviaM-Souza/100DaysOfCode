import br.com.oliviasouza.modelos.MinhasPreferidas;
import br.com.oliviasouza.modelos.Musica;
import br.com.oliviasouza.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica novaMusica = new Musica();
        novaMusica.setTitulo("Army Dreamers");
        novaMusica.setArtista("Kate Bush");
        novaMusica.setAlbum("Never for ever");

        for(int i = 0; i < 1000; i++){
            novaMusica.reproduzir();
        }

        for (int i = 0; i < 60 ; i++) {
            novaMusica.curtir();
        }

        Podcast novoPodcast = new Podcast();
        novoPodcast.setTitulo("Sobre sentimentos");
        novoPodcast.setHost("Olívia Souza");

        for (int i = 0; i < 650; i++) {
            novoPodcast.reproduzir();
        }

        for (int i = 0; i < 400; i++) {
            novoPodcast.curtir();
        }

        MinhasPreferidas preferida = new MinhasPreferidas();
        preferida.inclui(novoPodcast);
        preferida.inclui(novaMusica);
    }
}