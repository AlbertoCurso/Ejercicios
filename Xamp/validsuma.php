<?php
    $s1 = $_POST["S1"];
    $s2 = $_POST["S2"];
    $rdo = $_POST["RDO"];
    $ip_client = $_SERVER["REMOTE_ADDR"];
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Curso Matemáticas</title>
</head>
<body>
    <?php
    echo("<h3>".$_SERVER["HTTP_USER_AGENT"]."<h3>");
    if ($ip_client=="192.168.3.143"){
        echo("<h3>Alejandro, traidor</h3>");
    }
    echo("<h3>".$ip_client."</h3>");
    if (($s1+$s2)==$rdo){
        echo("<h2>Eres un crack</h2>");
    } else {
        echo("<h2>Eres un participante de GH</h2>");
    }
    ?>
</body>
</html>