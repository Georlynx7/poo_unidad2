package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String director;
    private boolean esAnimado;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String director, boolean esAnimado) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.esAnimado = esAnimado;
    }

    public String getDirector() {
        return director;
    }

    public boolean isEsAnimado() {
        return esAnimado;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("CORTOMETRAJE: " + getTitulo() + " | Género: " + getGenero() + 
                           " | Duración: " + getDuracionEnMinutos() + " min | Director: " + director + 
                           " | Animado: " + (esAnimado ? "Sí" : "No"));
    }
}