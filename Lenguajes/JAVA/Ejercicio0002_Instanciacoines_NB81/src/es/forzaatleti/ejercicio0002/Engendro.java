package es.forzaatleti.ejercicio0002;

/**
 *
 * @author Alberto Prado Iglesias
 */
public class Engendro {
    private String nombre; // Atributo
    private int anyoNacimiento;
    private boolean esFeo;
    /**
     * 
     * @param nombre Nombre del engendro
     * @param anyoNacimiento    Año en que nació el engendro
     * @param esFeo Es feo o no el engendro
     */
    
    
    // Creamos el objeto instanciando la clase
    public Engendro(String nombre, int anyoNacimiento, boolean esFeo) {
        this.nombre = nombre;
        this.anyoNacimiento = anyoNacimiento;
        this.esFeo = esFeo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    public boolean isEsFeo() {
        return esFeo;
    }

    public void setEsFeo(boolean esFeo) {
        this.esFeo = esFeo;
    }

    /**
     * Fuma un cigarrillo (ocurrencia mía)
     */
    
    
    
    public void fumar() {
        System.out.println("Fumando...");
    }
    
    public int calcularEdad(int anyoActual) {
        int edad = anyoActual - anyoNacimiento;
        return edad;
    }
    
}
