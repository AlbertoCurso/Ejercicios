package es.forzaatleti.ejercicio0008;

import java.util.ArrayList;

/**
 *
 * @author Desiapi
 */
public class GestorDiscos {

    public static Disco getDisco() {
        Disco theMiracle = new Disco(
                "The Miracle",
                "Queen",
                "https://www.udiscovermusic.com/wp-content/uploads/2019/11/the-miracle.jpg",
                15.99f);

        Cancion tema1 = new Cancion(1, "Party", 2.27f);
        Cancion tema2 = new Cancion(2, "Khashoggi's Ship", 3.32f);
        Cancion tema3 = new Cancion(3, "The Miracle", 4.15f);

        ArrayList<Cancion> canciones = new ArrayList();
        canciones.add(tema1);
        canciones.add(tema2);
        canciones.add(tema3);

        theMiracle.setCanciones(canciones); //Asignamos el array de canciones al disco
        
        return theMiracle;
    }
}
