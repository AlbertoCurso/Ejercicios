var c;
var ctx;
var alien;

function inicializar(){
    console.log("Inicializando...");
    // Obetenemos la referencia al canvas (lienzo)
    c   = document.getElementById("pantalla");
    ctx = c.getContext("2d");

    // Pintamos la pantalla
    ctx.fillStyle = "black";
    ctx.fillRect(0, 0, c.width, c.height);

    //Instanciamos el alien
    antonio = new Invasor("invasor1.png", 0, 0, 50, 50, 5);
    alberto = new Invasor("invasor2.png", 55, 0, 50, 50, 7);

    //Llamada a jugar
    setInterval(function(){
        jugar();
    },1000);
}

function jugar(){
    console.log("Jugando...");
    ctx.fillRect(0, 0, c.width, c.height);
    antonio.mover();
    alberto.mover();
}