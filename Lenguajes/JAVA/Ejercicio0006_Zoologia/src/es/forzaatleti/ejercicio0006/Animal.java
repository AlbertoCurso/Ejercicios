package es.forzaatleti.ejercicio0006;

/**
 *
 * @author Alberto Prado Iglesias
 */
public class Animal {
    private String nombre;
    private float peso;
    private boolean isVivo;
    private int edad;

    public void comer(){
        System.out.println("Animal comiendo...");
    }
    
    public void reproducir(){
        System.out.println("Animal reproduciéndose...");
    }
}
