# PRACTICA 6: PERSISTENCIA DE QUERYS

Durante esta práctica se quiere a desarrollar una APP de Spring Boot incluyendo una funcionalidad que permita persistir información utilizando la librería Spring Data JDBC con una base de datos H2.

Además el módulo de persistencia ha de incluir las siguientes operaciones
- INSERT 
- UPDATE  
- SELECT
- DELETE

Dichas operaciones tienen que incluir como mínimo dos operaciones “JOINS”  utilizando la anotación @Query.

NOTA: NO SÉ POR QUÉ PERO AL LEVANTAR EL SERVIDOR DE SPRING BOOT ME DA EL SIGUIENTE ERROR:

![Captura de pantalla 2022-04-17 a las 21 11 42](https://user-images.githubusercontent.com/98181428/163731794-8db0eb82-e48f-4279-a159-53d9cec07c41.png)

Aun así procedo a explicar la practica que he realizado.
Se ha querido realizar una app que recoja los datos de los clientes que solicitan pedidos de los productos de la marca. De esta manera va a ser mucho más facil localizarlos a la hora de contactar con ellos. Para ello se han creado cuatro carpetas:
- Controller 
- Model
- Repository
- Service. 

Además, dentro de resources, en la capeta de database se encuentra un fichero denominado scheme.sql, el cual recoge los tipos de datos que va a contener mi base de datos, y el fichero data.sql, donde se insertan una serie de clietes.

Por consiguiente la clase principal va a ser Cliente que estará compuesta por una serie de atributos los cuales van a usarse en la tabla "CLIENT":
- id 
- name_client
- surname_client
- email
- age 

En cuanto a los métodos que se han usado durante la práctica son:

- **@GetMapping** para obtener todos los clientes de la empresa _The CocaCola Company_
- **@GetMapping** con id del cliente 
- **@PutMapping** para actualizar cualquier parametro de un objeto Cliente
- **@DeleteMapping** para eliminar un cliente

Finalmente, mencionar que Las dos operaciones con @Query se usan en los stributos  id y age.

Como ya se ha explicado, no se ha podido levantar el servidor de Spring boot pero para comprobar que se pueden ejecutar todos los comandos mencionados habria que acceder al siguiente link
