console.log("Jugando...");

var posPlayer1 = 0;
var posPlayer2 = 0;
var jugando = true;
const SPEED = 10;
const META = 100;

function inicializar()
{
	var logo = document.getElementById("logo");
	//ALTERNATIVA BIND 1
	logo.onmouseover = function()
	{
		console.log("ENTRANDO");
	}

	//ALTERNATIVA BIND 2
	logo.addEventListener("mouseleave", function()
	{
		console.log("SALIENDO");
	});
}

function zoom(idCoche)
{
	var coche = document.getElementById("player"+idCoche);
	coche.style.width = "500px";
}

function antizoom(idCoche)
{
	var coche = document.getElementById("player"+idCoche);
	coche.style.width = "250px";
}

function capturarPulsacion(tecla)
{
	//a minúscula -> player 1
	//l minúscula -> player 2

	if (jugando == true)
	{
		if (tecla.key == "a")
		{
			console.log("Mueve Player1");
			posPlayer1 += SPEED;
			document.getElementById("player1").style.paddingLeft = posPlayer1 + "px";
		}

		if (tecla.key == "l")
		{
			console.log("Mueve Player2");
			posPlayer2 += SPEED;
			document.getElementById("player2").style.paddingLeft = posPlayer2 + "px";
		}

		if (posPlayer1 >= META)
		{
			zoom(1);
			antizoom(2);
			document.getElementById("campeon").innerHTML="HA GANADO EL PLAYER 1";
			//alert("Ha ganado el Player 1");
			jugando = false;
		}

		if (posPlayer2 >= META)
		{
			zoom(2);
			antizoom(1);
			//alert("Ha ganado el Player 2");
			document.getElementById("campeon").innerHTML="HA GANADO EL PLAYER 2";
			jugando = false;
		}
	} 
}