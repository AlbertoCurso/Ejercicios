package es.forzaatleti.ejercicio0005;

/**
 *
 * @author Alberto Prado Iglesias
 */
public class CalculadoraPanico {
    private float contagiados;
    private float bajas;

    public CalculadoraPanico(int contagiados, int bajas) {
        this.contagiados = contagiados;
        this.bajas = bajas;
    }
    
    public String calcular(){
        String riesgo;
        
        float porcentaje = bajas / contagiados * 100;
        
        if (porcentaje < 3) {
            riesgo = "Estamos en unas cifras sostenibles, sólo hay inquietud";
        } else if (porcentaje < 10) {
            riesgo = "Estamos en unas cifras complicadas, ya hay miedito";
        } else {
            riesgo = "Estamos jodidos, el apocalipsis, pero hay más trabajo";
        }
        return riesgo;
    }
}
