# Informática II: Gestión de Tareas en Java con Spring Boot y H2.
## Introducción.
En este proyecto, desarrollarás una aplicación web de gestión de tareas utilizando Java con Spring Boot. La aplicación permitirá a los usuarios cargar y gestionar tareas, almacenándolas en
una base de datos en memoria H2 y mostrando las tareas en páginas JSP utilizando JSTL. La aplicación constará de cuatro ejercicios principales, cada uno con un conjunto específico de requisitos y objetivos.

## Ejercicio 1.
Configurar el proyecto Spring Boot:
- Crea un nuevo proyecto Spring Boot utilizando Spring Initializr.
- Incluye las dependencias necesarias: Spring Web, Spring Data JPA, H2 Database, JSTL y Spring Boot DevTools.
- Configura el archivo application.properties para utilizar la base de datos H2 en memoria.

Crear el modelo de datos:

Define una entidad Tarea con los siguientes atributos:
- id (Long, auto-generado)
- titulo (String)
- descripcion (String)
- fechaCreacion (LocalDateTime)
- completada (Boolean)

Crear el repositorio de datos:
- Define una interfaz TareaRepository que extienda JpaRepository<Tarea, Long>.

## Ejercicio 2.
Crear el servicio de tareas:

Implementa una clase TareaService que contenga los métodos para:
- Crear una nueva tarea.
- Obtener todas las tareas.
- Obtener una tarea por ID.
- Actualizar una tarea.
- Eliminar una tarea.


Controlador REST para tareas:

Implementa un controlador TareaController con endpoints para:
- Crear una tarea (POST /tareas).
- Obtener formulario de inserción de tareas (GET / /home).
- Obtener todas las tareas (GET /tareas).
## Ejercicio 3.
Crear la página JSP para cargar tareas:
- Implementa una página cargarTarea.jsp que contenga un formulario para ingresar el título, descripción y estado de una nueva tarea.
- Utiliza JSTL para manejar la lógica de la página y enviar los datos al backend.


Crear la página JSP para listar todas las tareas:
- Implementa una página listarTareas.jsp que muestre una lista de todas las tareas almacenadas en la base de datos.
- Utiliza JSTL para iterar sobre la lista de tareas y mostrarlas en una tabla.

## Ejercicio 4.
Integrar el frontend con el backend:
- Configura el controlador para manejar las solicitudes de las páginas JSP.
- Asegúrate de que el formulario en cargarTarea.jsp envíe los datos correctamente al backend y se almacenen en la base de datos H2.
- Configura la página listarTareas.jsp para que obtenga y muestre la lista de tareas desde el backend.


Pruebas funcionales:
- Realiza pruebas para asegurarte de que puedes:
- Crear una nueva tarea desde el formulario.
- Ver todas las tareas en la página de listado.
