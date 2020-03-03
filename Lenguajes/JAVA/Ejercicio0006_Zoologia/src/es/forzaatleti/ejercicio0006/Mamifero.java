package com.fernandopaniagua.ejercicio6;

import java.time.Period;

public class Mamifero extends Animal {
    private int numeroMamas;
    private Period periodoLactancia;

    public void mamar(){
        System.out.println("Mamando...");
    }
    
    @Override
    public void comer(){
        System.out.println("Comiendo mamifero");
    }
    
    public void comer(Reptil alimento){
        System.out.println("Mamifero mamifero reptil...");
    }
    
    public void comer(Marsupial alimento){
        System.out.println("Mamifero mamifero canguro...");
    }
}
