package es.forzaatleti.ejercicio0004;

/**
 *
 * @author Alberto Prado Iglesias
 */
public class Arbitro {
    private String nombre;
    private Balon balon;

    public Arbitro(String nombre) {
        this.nombre = nombre;
    }

    public void setBalon(Balon balon) {
        System.out.println("El árbitro ha recibido el balón");
        this.balon = balon;
    }

    public void cederBalon(Jugador jugador){
        System.out.println("El árbitro cede el balón a " + jugador.getNombre());
        jugador.setBalon(balon);
    }
}
