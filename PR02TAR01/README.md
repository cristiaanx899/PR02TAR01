# Java Web CRUD Productos

Este proyecto es una aplicación web que implementa un sistema CRUD (Crear, Leer, Actualizar, Eliminar) para gestionar productos utilizando Java Servlets y JSP, con una base de datos MySQL. La aplicación utiliza AJAX (fetch) para realizar operaciones de manera asíncrona.

## Estructura del Proyecto

```
java-web-crud-productos
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── ejemplo
│   │   │           ├── controller
│   │   │           │   └── ProductoServlet.java
│   │   │           ├── dao
│   │   │           │   └── ProductoDAO.java
│   │   │           ├── model
│   │   │           │   └── Producto.java
│   │   │           └── util
│   │   │               └── ConexionDB.java
│   │   └── webapp
│   │       ├── index.jsp
│   │       ├── productos.jsp
│   │       ├── js
│   │       │   └── productos.js
│   │       └── WEB-INF
│   │           └── web.xml
├── pom.xml
└── README.md
```

## Requisitos

- JDK 8 o superior
- Apache Tomcat o cualquier servidor compatible con Servlets y JSP
- MySQL

## Configuración de la Base de Datos

1. Crear una base de datos en MySQL llamada `productos_db`.
2. Crear una tabla `productos` con la siguiente estructura:

```sql
CREATE TABLE productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2) NOT NULL
);
```

3. Configurar la conexión a la base de datos en la clase `ConexionDB.java`.

## Ejecución del Proyecto

1. Clonar el repositorio en tu máquina local.
2. Abrir el proyecto en tu IDE favorito.
3. Asegurarse de que el archivo `pom.xml` contenga las dependencias necesarias para Servlets y MySQL.
4. Desplegar el proyecto en un servidor compatible (como Apache Tomcat).
5. Acceder a la aplicación a través de `http://localhost:8080/java-web-crud-productos/index.jsp`.

## Funcionalidades

- Agregar nuevos productos.
- Listar productos existentes.
- Editar productos seleccionados.
- Eliminar productos.
- Interacción asíncrona con el servidor utilizando AJAX.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar el proyecto, por favor abre un issue o envía un pull request.

## Licencia

Este proyecto está bajo la Licencia MIT.