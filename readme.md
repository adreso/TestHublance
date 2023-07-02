# Test Hublance realizado por Andrés Arrieta 

## Este proyecto esta organizado de la siguiente manera:


1. Se separan por entidades las carpetas, de esta forma, se tiene una carpeta con **"Prices"**, si se tuviera otra entidad como productos se pondría en otra carpeta.
2. Separamos por capas el proyecto en aplicación, dominio e infraestructura, tratando de simular una arquitectura por capas.
3. La capa de Infraestructura en este caso como solo tiene una base de datos, se encarga de conectar el Entity con la base de Datos H2 y se conecta al dominio a través del GateWay y transforma los datos con ayuda del Mapper.
4. La capa de Dominio tiene toda la lógica de negocio, se encarga de recibir los datos del GateWay y transformarlos con ayuda del Mapper, para luego enviarlos a la capa de aplicación.
5. La capa de Aplicación se encarga de recibir los datos de la capa de dominio y enviarlos al controlador, en este caso solo tiene un controlador, pero si tuviera más, se encargaría de enviar los datos a cada controlador.
6. De la misma forma se realizan los test, en este caso solo se realizan test para la capa de aplicación en el controlador.