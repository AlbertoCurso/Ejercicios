package es.forzaatleti.ejercicio0008;

/**
 *
 * @author Desiapi
 */
public class Pelicula {
    private String titulo;
    private String director;
    private int metraje;
    private String sinopsis;

    public Pelicula(String titulo, String director, int metraje, String sinopsis) {
        this.titulo = titulo;
        this.director = director;
        this.metraje = metraje;
        this.sinopsis = sinopsis;
    }
    
    public void imprimir(){
        System.out.println("Título:         " + titulo);
        System.out.println("Director:       " + director);
        System.out.println("Metraje:        " + metraje + " Minutos");
        System.out.println("Sinopsis:       " + sinopsis);
    }
}
