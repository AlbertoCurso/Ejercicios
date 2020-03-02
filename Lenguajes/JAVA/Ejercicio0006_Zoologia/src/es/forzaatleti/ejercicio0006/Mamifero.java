package es.forzaatleti.ejercicio0006;

import java.time.Period;

/**
 *
 * @author Alberto Prado Iglesias
 */
public class Mamifero extends Animal{
    private int numeroMamas;
    private Period periodoLactancia;
    
    public void mamar(){
        System.out.println("Mamando...");
    }
}
