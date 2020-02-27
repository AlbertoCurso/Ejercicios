package es.forzaatleti.ejercicio0003;

/**
 * 
 * @author Alberto Prado Iglesias
 */
public class Automovil {
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private int cv;
    /**
     * 
     * @param marca         marca del automóvil
     * @param modelo        modelo del automóvil
     * @param color         color del automóvil
     * @param matricula     matrícula del automóvil
     */
    public Automovil(String marca, String modelo, String color, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
    }
    /**
     * 
     * @param marca         marca del automóvil
     * @param modelo        modelo del automóvil
     * @param color         color del automóvil
     * @param matricula     matrícula del automóvil
     * @param cv            Caballos de Vapor del automóvil
     */
    public Automovil(String marca, String modelo, String color, String matricula, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.cv = cv;
    }
    
    public void arrancar() {
        System.out.println("Arráncalo Carlos por Diosssss...");
    }

    public void parar() {
        System.out.println("parandoooooo");
    }

    public void avanzar() {
        System.out.println("avanzando, despacico");
    }
}