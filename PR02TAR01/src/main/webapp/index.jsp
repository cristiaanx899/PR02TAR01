<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD de Productos</title>
    <link rel="stylesheet" href="css/styles.css">
    <script src="js/productos.js" defer></script>
</head>
<body>
    <h1>Gestión de Productos</h1>
    <div id="mensaje"></div>
    <form id="productoForm">
        <input type="hidden" id="id" name="id">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required>
        <label for="descripcion">Descripción:</label>
        <input type="text" id="descripcion" name="descripcion" required>
        <label for="precio">Precio:</label>
        <input type="number" id="precio" name="precio" required>
        <button type="submit">Guardar Producto</button>
    </form>
    <button type="button" id="btnMostrar">MOSTRAR</button>
    <button type="button" id="btnEliminar">ELIMINAR</button>
    <h2>Lista de Productos</h2>
    <div id="listaProductos"></div>
</body>
</html>