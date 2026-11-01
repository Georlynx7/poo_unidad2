package uni1a;

public class Temporada {
    private int numeroTemporada;
    private int numeroEpisodios;

    public Temporada(int numeroTemporada, int numeroEpisodios) {
        this.numeroTemporada = numeroTemporada;
        this.numeroEpisodios = numeroEpisodios;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    @Override
    public String toString() {
        return "Temporada " + numeroTemporada + " [" + numeroEpisodios + " eps]";
    }
}