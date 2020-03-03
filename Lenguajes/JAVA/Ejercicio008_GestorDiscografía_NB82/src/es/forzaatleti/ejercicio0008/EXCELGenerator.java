package es.forzaatleti.ejercicio0008;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author Desiapi
 */
public class EXCELGenerator {
        public static void generarEXCEL(Disco disco, String ruta) {
        try {
            String nombreFichero = disco.getTitulo() + ".xls";
            nombreFichero = nombreFichero.replace(' ', '_');

            // Apertura fichero
            PrintWriter pw = new PrintWriter(new File(nombreFichero));

            // Contenido del fichero
            pw.println("Titulo: \t" + disco.getTitulo() + "\n");
            pw.println("Artista: \t" + disco.getArtista() + "\n");
            pw.println("Precio: \t" + disco.getPrecio() + "\n\n");
            pw.println("Canciones:");

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
                pw.println("\t"
                        + c.getOrdinal()
                        + "\t"
                        + c.getTitulo()
                        + "Duracion: \t"
                        + c.getDuracion()
                        + " \t Minutos");
            }
            //Fin de alternativa 3            pw.print("</div></body></html>");

            // Cierre del fichero 
            pw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
