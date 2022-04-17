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

Como ya se ha explicado, no se ha podido levantar el servidor de Spring boot pero para comprobar que se pueden ejecutar todos los comandos mencionados:
Si se realiza un **GET** se han de mostrar los clientes introducidos en data.sql, en mi caso solo he escrito 4. Para ello se accede al siguiente link: localhost:8080/api/v1/clients/. Si en vez de querer mostrar todos los clientes, se quiere buscar uno en concreto, por medio del id y haciendo un get se puede obtener dicha información, en este caso si queremos buscar el cliente C20223 seria:  localhost:8080/api/v1/clients/C20223/

Si se quiere realizar un **PUT** para modificar por ejemplo el tercer participane y cambiar su edad, habrá que acceder a localhost:8080/api/v1/clients/C20223/

Para poder borrar un cliente se ha de hacer uso del método **DELETE** y habrá que indicarle en la URL qué cliente se desea borrar. Por ejemplo, si es el tercero como en el caso anterior, la URL sería DELETE localhost:8080/api/v1/clients/C20223/


