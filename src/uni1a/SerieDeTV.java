/**
 * Class SerieDeTV
 */
package uni1a;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas; // Composición

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(int numTemporada, int eps) {
        temporadas.add(new Temporada(numTemporada, eps));
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("SERIE DE TV: " + getTitulo() + " | Género: " + getGenero() + 
                           " | Temporadas registradas: " + temporadas.size());
        System.out.println("   Listado: " + temporadas);
    }
}