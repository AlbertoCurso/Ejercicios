class Invasor{
    /*  aspecto     - fichero png
        posicion    - x,y
        tamaño      - alto, ancho
        velocidad   - 
        aspecto del disparo - fichero gráfico
        estado      - vivos, muertos, muriéndose
    */
   
    constructor(nombreFichero, x, y, alto, ancho, velocidad) {
        this.aspecto = new Image();
        this.aspecto.src = "./imagenes/" + nombreFichero;
        this.x = x;
        this.y = y;
        this.alto = alto;
        this.ancho = ancho;
        this.velocidad = velocidad;
    }

    mover() {
        this.x = this.x + this.velocidad;
        ctx.drawImage(this.aspecto, this.x, this.y, this.alto, this.ancho)
        console.log(this.x);
        if (this.x >= 100)
        {
            this.velocidad = -5
        }
        if (this.x <= 0)
        {
            this.velocidad = +5
        }
    }

    disparar() {

    }

    bajar() {

    }

    morir() {

    }

}