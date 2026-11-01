/**
 * Class Documental
 */
package uni1a;

// Subclase Documental que extiende de ContenidoAudiovisual

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador; // Asociación

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("DOCUMENTAL: " + getTitulo() + " | Género: " + getGenero() + 
                           " | Duración: " + getDuracionEnMinutos() + " min | Tema: " + tema);
        System.out.println("   Investigador: " + (investigador != null ? investigador : "Sin asignar"));
    }
}