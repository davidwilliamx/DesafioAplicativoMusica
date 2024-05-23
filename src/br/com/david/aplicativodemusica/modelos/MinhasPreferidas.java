package br.com.david.aplicativodemusica.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto! E um dos titúlos preferidos da galera!");
        } else {
            System.out.println(audio.getTitulo() + " é um dos titúlos que todo mundo está curtindo. Não deixe de ouvir também!");
        }
    }
}
