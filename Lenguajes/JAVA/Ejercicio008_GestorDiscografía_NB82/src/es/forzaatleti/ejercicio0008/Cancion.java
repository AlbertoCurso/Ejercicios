package es.forzaatleti.ejercicio0008;

/**
 *
 * @author Desiapi
 */
public class Cancion{
    private int ordinal;
    private String titulo;
    private float duracion;

    public Cancion(int ordinal, String titulo, float duracion) {
        this.ordinal = ordinal;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getDuracion() {
        return duracion;
    }
    
    
}
