package com.fernandopaniagua.ejercicio6;

public class Ejecutador {
    public static void main(String[] args) {
        Mamifero ramon = new Mamifero();
        ramon.reproducir();
        ramon.comer();
        ramon.mamar();
        
        Reptil juancho = new Reptil();
        juancho.reproducir();
        juancho.comer();
        juancho.hibernar();
    }
}
