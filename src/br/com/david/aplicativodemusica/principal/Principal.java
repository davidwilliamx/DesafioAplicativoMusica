package br.com.david.aplicativodemusica.principal;

import br.com.david.aplicativodemusica.modelos.MinhasPreferidas;
import br.com.david.aplicativodemusica.modelos.Musica;
import br.com.david.aplicativodemusica.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        // Simular curtidas e reproduções
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");


        // Simular curtidas e reproduções
        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }


        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
