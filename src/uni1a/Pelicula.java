/**
 * Class Pelicula
 */
package uni1a;

// Subclase Pelicula que extiende de ContenidoAudiovisual

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> actores; // Agregación

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("PELÍCULA: " + getTitulo() + " | Género: " + getGenero() + 
                           " | Duración: " + getDuracionEnMinutos() + " min | Estudio: " + estudio);
        System.out.println("   Actores: " + actores);
    }
}