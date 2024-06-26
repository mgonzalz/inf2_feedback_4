<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Formulario de Tareas</title>
    <link href="/content/styles/styles.css" rel="stylesheet">
</head>
<body>
    <h1>FORMULARIO DE TAREAS: CARGA DE TAREAS</h1>
    <br>
    <form action="formularioTarea" method="post">
        <label for="titulo">Titulo</label>
        <input type="text" id="titulo" name="titulo" required>
        <br>
        <label for="descripcion">Descripcion</label>
        <input type="text" id="descripcion" name="descripcion" required>
        <br>
        <label for="completada">Estado:</label>
        <select id="completada" name="completada" required>
            <option value="true">Completada</option>
            <option value="false">No completada</option>
        </select>
        <br>
        <input type="submit" value="Enviar">
    </form>
    <br>
    <form action="/vertarea" method="get">
        <button type="submit">Ver Tareas</button>
    </form>
</body>
</html>