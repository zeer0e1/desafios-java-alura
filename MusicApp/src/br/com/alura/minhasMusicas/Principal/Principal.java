package br.com.alura.minhasMusicas.Principal;

import br.com.alura.minhasMusicas.Modelos.MinhasPreferidas;
import br.com.alura.minhasMusicas.Modelos.Musica;
import br.com.alura.minhasMusicas.Modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000 ; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 500 ; i++) {
            minhaMusica.curte();
        }

        Podcast meuPotcast = new Podcast();
        meuPotcast.setTitulo("BolhaDev");
        meuPotcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 5000 ; i++) {
            meuPotcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPotcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPotcast);
        preferidas.inclui(minhaMusica);
    }
}
