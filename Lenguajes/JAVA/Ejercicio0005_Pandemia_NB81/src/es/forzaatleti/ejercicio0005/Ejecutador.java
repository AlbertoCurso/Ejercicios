package es.forzaatleti.ejercicio0005;

/**
 *
 * @author Alberto Prado Iglesias
 */
public class Ejecutador {
    public static void main(String[] args) {
        CalculadoraPanico cp = new CalculadoraPanico(100,14);
        String nivelDeRiesgo = cp.calcular();
        System.out.println(nivelDeRiesgo);
    }
}
