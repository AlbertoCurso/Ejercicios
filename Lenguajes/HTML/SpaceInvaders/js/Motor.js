var c;
var ctx;
var alien;
var velocidad = 10;
var velocidad3 = 10;
var velocidad5 = 10;

function inicializar(){
    console.log("Inicializando...");
    // Obetenemos la referencia al canvas (lienzo)
    c   = document.getElementById("pantalla");
    ctx = c.getContext("2d");

    // Pintamos la pantalla
    ctx.fillStyle = "black";
    ctx.fillRect(0, 0, c.width, c.height);

    //Instanciamos los alien de la primera fila
    invasor1 = new Invasor("invasor1.png", 0, 0, 80, 50, 10);
    invasor2 = new Invasor("invasor1.png", 85, 0, 80, 50, 10);    
    invasor3 = new Invasor("invasor1.png", 170, 0, 80, 50, 10);    
    invasor4 = new Invasor("invasor1.png", 255, 0, 80, 50, 10);    
    invasor5 = new Invasor("invasor1.png", 340, 0, 80, 50, 10);    
    invasor6 = new Invasor("invasor1.png", 425, 0, 80, 50, 10);    
    invasor7 = new Invasor("invasor1.png", 510, 0, 80, 50, 10);    
    invasor8 = new Invasor("invasor1.png", 595, 0, 80, 50, 10);    
    
    //Instanciamos los alien de la segunda fila
    invasor9 = new Invasor("invasor2.png", 0, 55, 80, 50, 10);
    invasor10 = new Invasor("invasor2.png", 85, 55, 80, 50, 10);    
    invasor11 = new Invasor("invasor2.png", 170, 55, 80, 50, 10);    
    invasor12 = new Invasor("invasor2.png", 255, 55, 80, 50, 10);    
    invasor13 = new Invasor("invasor2.png", 340, 55, 80, 50, 10);    
    invasor14 = new Invasor("invasor2.png", 425, 55, 80, 50, 10);    
    invasor15 = new Invasor("invasor2.png", 510, 55, 80, 50, 10);    
    invasor16 = new Invasor("invasor2.png", 595, 55, 80, 50, 10);    
    
    //Instanciamos los alien de la segunda fila
    invasor17 = new Invasor("invasor3.png", 0, 110, 80, 50, 10);
    invasor18 = new Invasor("invasor3.png", 85, 110, 80, 50, 10);    
    invasor19 = new Invasor("invasor3.png", 170, 110, 80, 50, 10);    
    invasor20 = new Invasor("invasor3.png", 255, 110, 80, 50, 10);    
    invasor21 = new Invasor("invasor3.png", 340, 110, 80, 50, 10);    
    invasor22 = new Invasor("invasor3.png", 425, 110, 80, 50, 10);    
    invasor23 = new Invasor("invasor3.png", 510, 110, 80, 50, 10);    
    invasor24 = new Invasor("invasor3.png", 595, 110, 80, 50, 10);    
    
    //Llamada a jugar
    setInterval(function(){
        jugar();
    },500);
}

function jugar(){
    ctx.fillRect(0, 0, c.width, c.height);
    velocidad2 = velocidad
    if (velocidad != velocidad2)
    {
        velocidad = invasor1.mover(velocidad);
    }
    else
    {
        velocidad2 = invasor1.mover(velocidad);
    }

    velocidad = invasor2.mover(velocidad);
    velocidad = invasor3.mover(velocidad);
    velocidad = invasor4.mover(velocidad);
    velocidad = invasor5.mover(velocidad);
    velocidad = invasor6.mover(velocidad);
    velocidad = invasor7.mover(velocidad);

    if (velocidad != velocidad2)
    {
        velocidad = invasor8.mover(velocidad);
    }
    else
    {
        velocidad2 = invasor8.mover(velocidad);
    }

    velocidad = velocidad2;

    velocidad4 = velocidad3
    if (velocidad3 != velocidad4)
    {
        velocidad3 = invasor9.mover2(velocidad3);
    }
    else
    {
        velocidad4 = invasor9.mover2(velocidad3);
    }

    velocidad3 = invasor10.mover2(velocidad3);
    velocidad3 = invasor11.mover2(velocidad3);
    velocidad3 = invasor12.mover2(velocidad3);
    velocidad3 = invasor13.mover2(velocidad3);
    velocidad3 = invasor14.mover2(velocidad3);
    velocidad3 = invasor15.mover2(velocidad3);

    if (velocidad3 != velocidad4)
    {
        velocidad3 = invasor16.mover2(velocidad3);
    }
    else
    {
        velocidad4 = invasor16.mover2(velocidad3);
    }

    velocidad3 = velocidad4;


    velocidad6 = velocidad5
    if (velocidad5 != velocidad6)
    {
        velocidad5 = invasor17.mover3(velocidad5);
    }
    else
    {
        velocidad6 = invasor17.mover3(velocidad5);
    }

    velocidad5 = invasor18.mover3(velocidad5);
    velocidad5 = invasor19.mover3(velocidad5);
    velocidad5 = invasor20.mover3(velocidad5);
    velocidad5 = invasor21.mover3(velocidad5);
    velocidad5 = invasor22.mover3(velocidad5);
    velocidad5 = invasor23.mover3(velocidad5);

    if (velocidad5 != velocidad6)
    {
        velocidad5 = invasor24.mover3(velocidad5);
    }
    else
    {
        velocidad6 = invasor24.mover3(velocidad5);
    }

    velocidad5 = velocidad6;
}