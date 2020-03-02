package es.forzaatleti.ejercicio07;

/**
 *
 * @author Alberto Prado Iglesias
 */
public class Ejecutador {
    public static void main(String[] args) {
        PeliculaTerror elexorcista  = new PeliculaTerror(true, false, 10, "El exorcista", "Alejandro", 121, "Una niña está posesa por Belcebú");
        PeliculaTerror viernes13    = new PeliculaTerror(true, false, 2, "Viernes 13", "Arturo", 118, "Asesino en serie en campamento");
        System.out.println("*********************************************************");
        elexorcista.imprimir();
        System.out.println("*********************************************************");
        System.out.println("*********************************************************");
        viernes13.imprimir();
        System.out.println("*********************************************************");
    }
    
}
