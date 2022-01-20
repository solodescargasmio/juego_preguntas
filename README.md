La aplicacion fue desarrollada en Netbeans 8.1, la base de datos en Mysql (workbench 8.0 y mysql server 5.7).
El lenguaje de programacion utilizado es JAVA 8 y el SDK es jdk1.8.0_271.


Funcionamiento del juego:
	 1- Debe de ingresar un nick para comenzar caso contrario no le permite jugar.
    2-Luego de guardar su nick, presionar el boton "Pregunta Aleatoria", esto muestra una pregunta de la categoria indicada.
    3-Seleccionar una respuesta en los RadioButtons.
    4-Presione el boton "Seleccionar" para esa respuesta, o puede precionar el boton anterior y volvera a elejir otra pregunta.
    5-Si es correcta, continua, caso contrario señala que se equivocó y reinicia el juego.
    
 El programa:
    La configuracion inicial de la base de datos (driver, user y password) la obtiene de un archivo "C:\\Juego.ini".
    Modificar solo el user si el de ustedes no es root y la password, hacerlo en la linea correspondiente.
    Este archivo está en la carpeta scrip_mysql asi como el script mysql, pegarlo en "C:".
    La base de datos se llama "juego_preguntas" crear el schema en mysql e importar el script a ese schema.
 	El ejecutble (archivo JAR) esta en la carpeta JAR/dist, ejecutarlo dentro de la carpeta dist o crear un acceso directo al escritorio.
 	
 	El proyecto general es la carpeta "Juego". 

    Gracias y espero haber cumplido con todo.
    Que tengan un lindo año.
