package br.com.david.aplicativodemusica;

public class Audio {
    private String titulo;
    private String artista;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo " + this.titulo + " por " + this.artista);
    }

    public void pausar() {
        System.out.println("Pausando " + this.titulo);
    }

    public void parar() {
        System.out.println("Parando " + this.titulo);
    }

    public void curtir() {
        this.curtidas++;
    }

}
