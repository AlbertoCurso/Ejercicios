package es.forzaatleti.ejercicio0008;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author Desiapi
 */
public class HTMLGenerator {

    public static void generarHTML(Disco disco1, String ruta) {
        try {
            String nombreFichero = disco1.getTitulo() + ".html";
            nombreFichero = nombreFichero.replace(' ', '_');

            // Apertura fichero
            PrintWriter pw = new PrintWriter(new File(nombreFichero));

            // Contenido del fichero
            pw.println("<html><head></head><body><div>");
            pw.println("<h1>Título: " + disco1.getTitulo() + "</h1>");
            pw.println("<h2>Artista: " + disco1.getArtista() + "</h2>");
            pw.println("<img src='" + disco1.getCaratula() + " width='300px' height='300px'></img>");
            pw.println("<h2>Precio: " + disco1.getPrecio() + "</h2>");
            pw.println("<h3>Canciones: </h2>");

            pw.print("</div></body></html>");

            // Cierre del fichero 
            pw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
