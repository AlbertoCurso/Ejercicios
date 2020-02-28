package es.forzaatleti.ejercicio0004;

/**
 *
 * @author Alberto Prado Iglesias
 */
public class Partido {
    public static void main(String[] args) {
        Balon balon = new Balon("Blanco");
        Arbitro arbitro = new Arbitro("Undiano");
        Jugador miguelAngel = new Jugador("Miguel Ángel");
        Jugador veronica = new Jugador("Verónica");
        Jugador pascual = new Jugador("Pascual");
    
        //1. Entregar el balón al árbitro
        arbitro.setBalon(balon);

        //2. Entregar el balón a un jugador
        arbitro.cederBalon(veronica);

        //3. el jugador pasa el balón a otro jugador
        veronica.pasarBalon(miguelAngel);
        miguelAngel.pasarBalon(pascual);

        //4. El jugador tira a puerta
        pascual.disparar();
    }
            
}
