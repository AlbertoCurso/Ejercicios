package es.forzaatleti.ejercicio0008;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author Desiapi
 */
public class HTMLGenerator {

    public static void generarHTML(Disco disco, String ruta) {
        try {
            String nombreFichero = disco.getTitulo() + ".html";
            nombreFichero = nombreFichero.replace(' ', '_');

            // Apertura fichero
            PrintWriter pw = new PrintWriter(new File(nombreFichero));

            // Contenido del fichero
            pw.println("<html><head></head><body><div>");
            pw.println("<h1>Título: " + disco.getTitulo() + "</h1>");
            pw.println("<h2>Artista: " + disco.getArtista() + "</h2>");
            pw.println("<img src='" + disco.getCaratula() + "' width='300px' height='300px'></img>");
            pw.println("<h2>Precio: " + disco.getPrecio() + "</h2>");
            pw.println("<h3>Canciones: </h2>");

            //Alternativa 1 - MÁS CUTRE
            /*
            for(int i=0;i<disco.getCanciones().size();i++){
                pw.println("<p>" + disco.getCanciones().get(i).getOrdinal() 
                        + "-" 
                        + disco.getCanciones().get(i).getTitulo() 
                        + "</p>");
            }
             */
            
            //Alternativa 2 - MENOS CUTRE - No le gusta a Alberto
            /*
            ArrayList<Cancion> canciones = disco.getCanciones();
            for(int i=0;i<canciones.size();i++){
                pw.println("<p>" + canciones.get(i).getOrdinal() 
                        + "-" 
                        + canciones.get(i).getTitulo() 
                        + "</p>");
            }
             */
            
            //Alternativa 3 - Alternativa COOL
            for (Cancion c : disco.getCanciones()) {
                pw.println("<p>"
                        + c.getOrdinal()
                        + "-"
                        + c.getTitulo()
                        + " Duración:"
                        + c.getDuracion()
                        + "</p>");
            }
            //Fin de alternativa 3            pw.print("</div></body></html>");

            // Cierre del fichero 
            pw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
