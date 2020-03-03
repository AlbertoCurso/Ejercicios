package es.forzaatleti.ejercicio0008;

/**
 *
 * @author Desiapi
 */
public class Creador {

    public static void main(String[] args) {
        Disco disco = GestorDiscos.getDisco();
        HTMLGenerator.generarHTML(disco, "I:/Alberto/Ejercicios/Lenguajes/JAVA/Ejercicio008_GestorDiscografía_NB82/");
        EXCELGenerator.generarEXCEL(disco, "I:/Alberto/Ejercicios/Lenguajes/JAVA/Ejercicio008_GestorDiscografía_NB82/");
        
        NotificationsGenerator.generateNotification("Disco-fashion", "HTML Creado");
        System.out.println("GAME OVER");//Verónica: color coral
        System.exit(0);
    }
}
