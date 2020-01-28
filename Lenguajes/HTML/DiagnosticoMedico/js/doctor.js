function diagnosticar()
{
    console.log("DIAGNOSTICANDO...");
    console.log(document.getElementById("dolordecabeza").checked);
    console.log(document.getElementById("fiebre").checked);
    console.log(document.getElementById("origen").checked);
    var dolorDeCabeza = document.getElementById("dolordecabeza").checked;
    var fiebre = document.getElementById("fiebre").checked;
    var origenChina = document.getElementById("origen").checked;
    console.log(dolorDeCabeza);
    if (dolorDeCabeza == false)
    {
        alert("No tienes nada, a currar vaguete");
    }
    else
    {
        if (fiebre == false)
        {
            alert("No tienes nada, a currar vaguete");
        }
        else
        {
            if (origenChina == false)
            {
                alert("Sólo tienes gripe, suertudo");
            }
            else
            {
                alert("Estás jodido, dale saludos a San Pedro");

            }
        }
    }  
}                      
