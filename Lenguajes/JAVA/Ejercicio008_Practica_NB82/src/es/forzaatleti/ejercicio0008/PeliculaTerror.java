package es.forzaatleti.ejercicio0008;

/**
 *
 * @author Desiapi
 */
public class PeliculaTerror extends Pelicula{
    private boolean haySangre;
    private boolean hayZombies;
    private int nivelTerror;

    public PeliculaTerror(boolean haySangre, boolean hayZombies, int nivelTerror, String titulo, String director, int metraje, String sinopsis) {
        super(titulo, director, metraje, sinopsis);
        this.haySangre = haySangre;
        this.hayZombies = hayZombies;
        this.nivelTerror = nivelTerror;
    }
    
    public void imprimir(){
        super.imprimir();
        if (haySangre){
            System.out.println("Hay Sangre");
        } else{
            System.out.println("Hay Sangre");
        }

        if (hayZombies){
            System.out.println("Hay Zombies");
        } else{
            System.out.println("Hay Zombies");
        }
        System.out.println("Nivel de Terror: " + nivelTerror);
    }
}
