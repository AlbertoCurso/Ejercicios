package es.forzaatleti.ejercicio07;

/**
 *
 * @author Alberto Prado Iglesias
 */
public class PeliculaTerror extends Pelicula{
    private boolean haySangre;
    private boolean hayZombies;
    private int nivelTerror; //Entre 1 y 10

    public PeliculaTerror(boolean haySangre, boolean hayZombies, int nivelTerror, String titulo, String director, int metraje, String argumento) {
        super(titulo, director, metraje, argumento);
        this.haySangre = haySangre;
        this.hayZombies = hayZombies;
        this.nivelTerror = nivelTerror;
    }

    @Override
    protected void imprimir(){
        super.imprimir();
        if (haySangre){
            System.out.println("Hay Sangre");
        } else{
            System.out.println("No hay Sangre");
        }
        if (hayZombies){
            System.out.println("Hay Zombies");
        } else{
            System.out.println("No hay Zombies");
        }
        System.out.println("Nivel de Terror: " + "       " + nivelTerror);
    }
    
}
