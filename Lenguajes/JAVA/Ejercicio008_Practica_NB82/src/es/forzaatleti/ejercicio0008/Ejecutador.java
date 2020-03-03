package es.forzaatleti.ejercicio0008;

/**
 *
 * @author Desiapi
 */
public class Ejecutador {

    public static void main(String[] args) {
        PeliculaTerror elExorcista = new PeliculaTerror(true, false, 10, "El exorcista", "Alejandro", 121, "Una niña está posesa por Belcebú");
        PeliculaTerror viernes13 = new PeliculaTerror(true, false, 2, "Viernes 13", "Arturo", 172, "Matanza en un campamento");
        System.out.println("******************************************");
        elExorcista.imprimir();
        System.out.println("******************************************");
        viernes13.imprimir();
        System.out.println("******************************************");
    }
}
