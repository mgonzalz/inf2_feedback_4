<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Formulario de Tareas</title>
</head>
<body>
    <h1>FORMULARIO DE TAREAS: CARGA DE TAREAS</h1>
    <form action="formularioTarea" method="post">
        <label for="titulo">Título</label>
        <input type="text" id="titulo" name="titulo" required>
        <br>
        <label for="descripcion">Descripción</label>
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
    <form action="/vertarea" method="get">
        <button type="submit">Ver Tareas</button>
    </form>
</body>
</html>