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
    }

    mover(velocidad) {
        this.x = this.x + velocidad;
        ctx.drawImage(this.aspecto, this.x, this.y, this.alto, this.ancho)
        if (this.x >= 720 || this.x <= 0)
        {
            velocidad = velocidad * -1;
        }
        return velocidad;
    }

    mover2(velocidad3) {
        this.x = this.x + velocidad3;
        ctx.drawImage(this.aspecto, this.x, this.y, this.alto, this.ancho)
        if (this.x >= 720 || this.x <= 0)
        {
            velocidad3 = velocidad3 * -1;
        }
        return velocidad3;
    }

    mover3(velocidad5) {
        this.x = this.x + velocidad5;
        ctx.drawImage(this.aspecto, this.x, this.y, this.alto, this.ancho)
        if (this.x >= 720 || this.x <= 0)
        {
            velocidad5 = velocidad5 * -1;
        }
        return velocidad5;
    }

    disparar() {

    }

    bajar() {

    }

    morir() {

    }

}