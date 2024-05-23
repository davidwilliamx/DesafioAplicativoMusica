package br.com.david.aplicativodemusica.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public void setTotalDeCurtidas(int totalDeCurtidas) {
        this.totalDeCurtidas = totalDeCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo " + this.titulo);
        this.totalDeReproducoes++;
    }

    public void pausar() {
        System.out.println("Pausando " + this.titulo);
    }

    public void parar() {
        System.out.println("Parando " + this.titulo);
    }

    public void curtir() {
        System.out.println("Você curtiu " + this.titulo);
        this.totalDeCurtidas++;
    }
}
