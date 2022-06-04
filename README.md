# Proyectyo_AFP
Primer proyecto de Java con Spring boot


•	Se utilizo Java 11

•	Se creo el proyecto con Spring Initializr en Maven con las siguientes dependencias: Rest Repositories, Spring Data JPA, Lombok, 
  PostgreSQL Driver y Spring Web(contiene el Tomcat)
  
•	El Luego se verificaron las dependencias en pom.xml

•	En cada interfaz relacionada a cada clase se utilizo la sentencia @RepositoryRestResource, que mediante JPA crea los metodos API REST 
  que luego se usaran en mis clases de implementacion.
  
•	Se utilizo JPA para crear desde el proyecto en Intellij, las tablas de la BD Postgres

•	Se utilizo Lombok para agregar al momento de ejecutar, los set y get de las clases relacionadas con las tablas.

•	Se utilizo Log4j para los logs que registran la informacion en cada operacion del CRUD 

•	Se adjunta el diagrama de relacional

![image](https://user-images.githubusercontent.com/95928945/171975946-11c9c3d0-760d-46a2-b110-96b8278863ac.png)
