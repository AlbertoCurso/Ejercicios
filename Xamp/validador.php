<?php
    $email  = $_GET["correo"];
    $pwd    = $_GET["contra"];
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
    if ($email == "albertocurso71@gmail.com" && $pwd == "patata")
    {
        echo("<H1>PADENTRO...</H1>");
    }
    else
    {
        echo("<H1>FUERA DE AQUÍ.....</H1>");
    }
    ?>
</body>
</html>