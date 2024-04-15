# API Revisión de Asientos

## Descripción

Este es un proyecto backend desarrollado con Spring Boot que utiliza una base de datos MySQL. Proporciona una API para gestionar datos relacionados con asientos contables.

## Requisitos

1. Clona el repositorio en tu máquina local:
   
   ```bash
   git clone https://github.com/tu-usuario/proyecto-backend-spring-boot.git
   ```
   
3. Crea una base de datos llamada 'revision'.
   
4. Abre el archivo 'aplication.properties' de la carpeta resources y configura:

   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/nombre_base_de_datos
   spring.datasource.username=usuario_mysql
   spring.datasource.password=contraseña_mysql
   ```
   
5. Ejecuta la aplicación:
    ```bash
    ./mvnw spring-boot:run
    ```
    o si tienes Maven instalado globalmente:
   ```bash
   mvn spring-boot:run
   ```
   
## Uso

La aplicación se ejecutará en http://localhost:8082. Puedes probar los endpoints de la API utilizando una herramienta como Postman, cURL o la que desees.

## Endpoints

* GET /revisionasientos: Obtener todos los asientos.
* GET /revisionasientos/{id}: Obtener un asiento por ID.
* POST /revisionasientos: Crear un nuevo asiento.
* (trabajando en endpoint filtros)


   
