package poo;

import java.util.ArrayList;
import java.util.List;
import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CONTENIDOS AUDIOVISUALES ===\n");

        List<ContenidoAudiovisual> contenidos = new ArrayList<>();

        // 1. Película con Actores (Agregación)
        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
        pelicula.agregarActor(new Actor("Leonardo DiCaprio", "Estadounidense"));
        pelicula.agregarActor(new Actor("Elliot Page", "Canadiense"));
        contenidos.add(pelicula);

        // 2. Serie de TV con Temporadas (Composición)
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 47, "Drama");
        serie.agregarTemporada(1, 7);
        serie.agregarTemporada(2, 13);
        contenidos.add(serie);

        // 3. Documental con Investigador (Asociación)
        Documental documental = new Documental("Cosmos", 60, "Ciencia", "El Universo");
        documental.setInvestigador(new Investigador("Carl Sagan", "Astrofísica"));
        contenidos.add(documental);

        // 4. Nueva Subclase: VideoYouTube
        VideoYouTube video = new VideoYouTube("Curso de POO en Java", 25, "Educación", "JavaPro", 15000);
        contenidos.add(video);

        // 5. Nueva Subclase: Cortometraje
        Cortometraje corto = new Cortometraje("Piper", 6, "Animación", "Alan Barillaro", true);
        contenidos.add(corto);

        // Mostrar detalles de todos los contenidos
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
            System.out.println("--------------------------------------------------");
        }
    }
}	