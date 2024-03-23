package com.peliculas.pelicula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PeliculaController {

    private List<Pelicula> peliculas = new ArrayList<>();

    // Constructor para añadir algunas películas a la lista
    public PeliculaController() {
        peliculas.add(new Pelicula(1, "El Señor de los Anillos: La Comunidad del Anillo", 2001, "Fantasía", "Peter Jackson", "Un grupo de héroes se embarca en un viaje para destruir el Anillo Único y poner fin al reinado de Sauron."));
        peliculas.add(new Pelicula(2, "Interestelar", 2014, "Ciencia Ficción", "Christopher Nolan", "Un grupo de exploradores utiliza un agujero de gusano recién descubierto para superar las limitaciones en los viajes espaciales humanos y conquistar las vastas distancias involucradas en un viaje interestelar."));
        peliculas.add(new Pelicula(3, "Inception", 2010, "Ciencia Ficción", "Christopher Nolan", "Un ladrón profesional que roba secretos a través del uso de la tecnología de compartir sueños, se le da la tarea inversa de plantar una idea en la mente del CEO de una empresa."));
        peliculas.add(new Pelicula(4, "El Padrino", 1972, "Crimen", "Francis Ford Coppola", "La envejecida patriarca de un imperio criminal traspasa el control de su clandestino imperio a su reacio hijo."));
        peliculas.add(new Pelicula(5, "Pulp Fiction", 1994, "Crimen", "Quentin Tarantino", "Las vidas de dos asesinos a sueldo de la mafia, un boxeador, un gánster y su esposa, y un par de bandidos comensales se entrelazan en cuatro historias de violencia y redención."));
    }
    
    // Obtener información detallada sobre una película por ID
    @GetMapping("/peliculas/{id}")
    public Pelicula getPeliculaById(@PathVariable int id) {
        return peliculas.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    // Obtener toda la información detallada sobre las películas
    @GetMapping("/peliculas")
    public List<Pelicula> getAllPeliculas() {
        return peliculas;
    }
}
