package es.forzaatleti.ejercicio07;

/**
 *
 * @author Alberto Prado Iglesias
 */
public class Pelicula {
    private String  titulo;
    private String  director;
    private int     metraje;
    private String  argumento;

    public Pelicula(String titulo, String director, int metraje, String argumento) {
        this.titulo = titulo;
        this.director = director;
        this.metraje = metraje;
        this.argumento = argumento;
    }

//    public String getTitulo() {
//        return titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
    
    protected void imprimir(){
        System.out.println("TITULO: 		" + titulo);
        System.out.println("DIRECTOR: 		" + director);
        System.out.println("DURACIÓN: 		" + metraje + " Minutos");
        System.out.println("SINOPSIS: 		" + argumento);
        
    }
}
