<?php
    $espa1      = $_GET["espa1"];
    $ingles1    = $_GET["ingles1"];
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>

<body>
    <?php
    if (($espa1 == "Perro"   && $ingles1  == "Dog")      ||
       ($espa1 == "Gato"    && $ingles1  == "Cat")       ||
       ($espa1 == "Patata"  && $ingles1  == "Potatoe"))
    {
        echo("<H1>¡¡¡ Eres una puta máquina !!!</H1>");
    }
    else
    {
        if ($espa1 == "Perro")
        {
            echo("<H1>Esta palabra en inglés se dice DOG</H1>");
        }
        else 
        {
            if ($espa1 == "Gato")
            {
                echo("<H1>Esta palabra en inglés se dice CAT</H1>");
            }
            else 
            {
                if ($espa1 == "Patata")
                {
                    echo("<H1>Esta palabra en inglés se dice POTATOE</H1>");
                }
                else
                {
                    echo("<H1>Esta palabra no existe en inglés</H1>");
                }
            }   
        }
    }
    ?>
</body>
</html>