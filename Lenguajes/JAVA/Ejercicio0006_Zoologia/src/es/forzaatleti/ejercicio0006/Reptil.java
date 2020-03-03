package com.fernandopaniagua.ejercicio6;

public class Reptil extends Animal {
    private int numeroEscamas;
    private float grosorCascaronCorreoso;
    
    @Override
    public void reproducir(){ //Sobreescritura
        super.reproducir();//Ejecución del método de la clase padre
        System.out.println("Reptil reproduciéndose...");
    }
    
    /**
     * Sabemos que no sólo los reptiles hibernan
     */
    public void hibernar(){
        System.out.println("Hibernando...");
    }
    
}
