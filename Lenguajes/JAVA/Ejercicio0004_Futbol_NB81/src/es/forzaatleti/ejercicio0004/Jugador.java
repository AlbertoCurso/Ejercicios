package es.forzaatleti.ejercicio0004;

/**
 *
 * @author Alberto Prado Iglesias
 */

public class Jugador {
    private String nombre;
    private Balon balon;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setBalon(Balon balon) {
        this.balon = balon;
    }

    public void pasarBalon(Jugador destinatario){
        System.out.println("Pasando el balón a " + destinatario.getNombre());
        destinatario.setBalon(balon); 
    }
        
    public void disparar(){
        System.out.println("Disparando el balón");
        balon.volar();
    }
    
}
