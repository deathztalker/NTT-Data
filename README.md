# Proyecto de Registro y Autenticación de Usuarios

Este es un proyecto que implementa una aplicación con una API RESTful para el registro y autenticación de usuarios. La aplicación utiliza Spring Framework, Hibernate y H2 Database en memoria.

## Características

- Registro de usuarios con los campos: nombre, correo, contraseña y teléfonos.
- Autenticación de usuarios con correo y contraseña.
- Actualización de información de usuarios existentes.
- Validaciones de correo, contraseña y formato de teléfonos.
- Generación y persistencia de tokens de acceso JWT.
- Uso de pruebas unitarias para validar funcionalidades.

## Requisitos

- Java 8+
- Gradle para el proceso de build
- Spring Framework
- Hibernate y H2 Database en memoria
- JWT para la generación de tokens de acceso
- Pruebas unitarias con JUnit

## Instrucciones de Uso

1. Clona este repositorio en tu máquina local:
2. Abre el proyecto en tu IDE preferido (Eclipse, IntelliJ, etc.).
3. Ejecuta la aplicación desde tu IDE o desde la línea de comandos:
4. Accede a la API a través de las siguientes rutas:

- Registro de usuario: POST `/api/registro`
- Autenticación de usuario: POST `/api/login`
- Actualización de usuario: PUT `/api/actualizar`

5. Puedes realizar pruebas de cada funcionalidad usando herramientas como Postman o cURL.

## Pruebas Unitarias

El proyecto incluye pruebas unitarias para validar la funcionalidad de registro, autenticación y actualización de usuarios. Las pruebas se encuentran en el directorio `src/test` y pueden ejecutarse utilizando el comando:

## Contribuciones

Si encuentras algún problema o tienes sugerencias de mejora, siéntete libre de abrir un issue en este repositorio. También son bienvenidas las pull requests para contribuir al desarrollo de la aplicación.

## Licencia

Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.
