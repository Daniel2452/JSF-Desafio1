# Proyecto JSF: Catálogo de Productos
### Descripción

Esta aplicación JSF presenta un catálogo de productos básico, incluyendo una API REST para consumir los datos en formato JSON. 
El proyecto fue construido en base a los requerimientos del desafío técnico de la materia Desarrollo de aplicaciones web con Frameworks donde se nos solicitaba un prototipo de una aplicación que mostrara insumos médicos a la venta.
Tecnologías Utilizadas

## Tecnologías Utilizadas
* Java: JDK 14 -> https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html
* Servidor de Aplicaciones: Payara Ultimate Tools
* Framework: Jakarta EE Server Faces (JSF) versión 8

## Despliegue
Abrir el IDE de IntelliJ IDEA y dar click al botón "Open" para buscar el proyecto descargado.

Al abrir el proyecto, nos dirigimos al apartado "File" y damos click en la opción "Project Structure"
![image](https://github.com/user-attachments/assets/e7ff9975-6628-4de3-b603-76c663b7c679)

Seleccionaremos la opción (14 java version "14.0.2") y luego dar click en "Aplpy" y "Ok"
![image](https://github.com/user-attachments/assets/70f007fb-e68a-4e2a-bd09-ceddbe0f08f9)

Ahora nos dirigimos al apartado "Run/Debug Configurations" y dar click a la opción "Edit Configurations..."
![image](https://github.com/user-attachments/assets/103d75ab-79c1-49e5-99bb-dd414c497f8a)

Nos dirigimos a la sección "Deployment" y agregaremos el archivo "war" tanto en "Deploy at the server startup" como en "Before Launch"
![image](https://github.com/user-attachments/assets/ff2f207e-57a7-404c-bcc0-676846e89598)

El resultado al ejecutar el proyecto debe de ser el siguiente:
![image](https://github.com/user-attachments/assets/9f9dbf8d-17eb-4960-af01-4370f8ca3b2e)

Por último, dar click al botón "Generar JSON" la página se recargará y mostrará un enlace en el que podrás ver los JSON
![image](https://github.com/user-attachments/assets/faaf2a72-b170-447e-9c3f-099bd8a4f10d)

## Descripcion de los Paquetes
### beans:
Contiene las clases anotadas con @ManagedBean y @RequestScoped que se encargan de gestionar la lógica de negocio y la interacción con la vista JSF. Estas clases suelen tener propiedades que representan los datos que se mostrarán en la interfaz de usuario y métodos para manipular esos datos.
### models:
Contiene las clases que representan los datos de la aplicación (entidades). Estas clases no tienen ninguna dependencia de JSF o de la capa de presentación. Su único propósito es encapsular los datos y sus relaciones.
### best:
Contiene las clases anotadas con @Path que exponen servicios REST. Estas clases permiten que otras aplicaciones o clientes accedan a los datos de la aplicación a través de HTTP.

## Funcionalidades: 
* Catálogo de Productos: Muestra una lista de productos con nombre, descripción, precio e imagen.
* API REST: Expone un endpoint REST (/rest/products) que devuelve los datos de los productos en formato JSON.

## Contribuidores:
* Carlos Peña [https://github.com/penaherrera]
* Daniel Rivas [https://github.com/Daniel2452]
