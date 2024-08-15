# Proyecto JSF: Catálogo de Productos
### Descripción

Esta aplicación JSF presenta un catálogo de productos básico, incluyendo una API REST para consumir los datos en formato JSON. 
El proyecto fue construido en base a los requerimientos del desafío técnico de la materia Desarrollo de aplicaciones web con Frameworks donde se nos solicitaba un prototipo de una aplicación que mostrara insumos médicos a la venta.
Tecnologías Utilizadas

## Tecnologías Utilizadas
* Java: JDK 14
* Servidor de Aplicaciones: Payara Server 5
* Framework: Java EE 8

## Despliegue

## Descripcion de los Paquetes
### beans:
Contiene las clases anotadas con @ManagedBean y @RequestScoped que se encargan de gestionar la lógica de negocio y la interacción con la vista JSF. Estas clases suelen tener propiedades que representan los datos que se mostrarán en la interfaz de usuario y métodos para manipular esos datos.
### models:
Contiene las clases que representan los datos de la aplicación (entidades). Estas clases no tienen ninguna dependencia de JSF o de la capa de presentación. Su único propósito es encapsular los datos y sus relaciones.
### rest:
Contiene las clases anotadas con @Path que exponen servicios REST. Estas clases permiten que otras aplicaciones o clientes accedan a los datos de la aplicación a través de HTTP.

## Funcionalidades: 
* Catálogo de Productos: Muestra una lista de productos con nombre, descripción, precio e imagen.
* API REST: Expone un endpoint REST (/rest/products) que devuelve los datos de los productos en formato JSON.

## Contribuidores:
* Carlos Peña [https://github.com/penaherrera]
* Daniel Rivas [https://github.com/Daniel2452]
