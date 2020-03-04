package es.forzaatleti.ejercicio0009.model;

/**
 *
 * @author Desiapi
 */
public class Gestor {

    /**
     * 0-5 Niños 6-15 Adolescentes 16-61 Adultos 61-Infinito Viejunos
     *
     * @param edad
     * @return
     */
    public static String calcularSegmento(int edad) {
        String segmento;
        if (edad <= 5) {
            segmento = "Niños";
        } else if (edad <= 15) {
            segmento = "Adolescentes";
        } else if (edad <= 61) {
            segmento = "Adultos";
        } else {
            segmento = "Viejunos";
        }
    return segmento;    
    }
    
    public static boolean esMayorEdad(int edad){
        boolean es;
        // Forma tradicional
//        if (edad >= 18){
//            es = true;
//        } else {
//            es = false;
//        }
        
        //Ternaria
//        es = edad >= 18 ? true : false;

        // La 'GUAY'
        es = edad >= 18;
        
        return es;    }
}
