<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Checkboxes</title>
</head>

<body>
    <!-- Arreglar el error para que el formulario funcione en la página checkBox.php -->
    <form action="index.php" method="post">
        <input type="checkbox" name="bebidas[]" value="Agua de coco">Agua de coco <br>
        <!-- Hacer 5 CHECKBOX con valores de bebidas -->
        <!-- Mandar todos los valores introducidos por el usuario a un arreglo con nombre bebidas[] -->
         <!-- Enviar los valores con un INPUT tipo SUBMIT -->
          <input type="submit" name="submit" value="Enviar">
    </form>
</body>

</html>

<?php
if (isset($_POST["submit"])) {
    // Asignar a una variable $bebidas los valores del método POST

    foreach ($bebidas as $elemento) {
        echo "La bebida es {$elemento} <br>";
    }
}
?>