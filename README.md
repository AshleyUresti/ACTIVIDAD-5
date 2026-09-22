Elementos básicos de JavaFX y su relación con POO
---
En esta actividad se reconocen los elementos básicos de JavaFX y su relación con conceptos de Programación Orientada a Objetos (POO), mediante una aplicación gráfica sencilla.


### ¿Qué es JavaFX?
- Es un framework de Java para crear interfaces gráficas de usuario (GUI).
- Permite construir aplicaciones de escritorio con:
  -  ventanas
  -  controles visuales (botones, campos de texto, etc)
  -  estilos personalizables (mediante CSS) y manejo de eventos
- Es una librería compuesta enteramente por clases y objetos.
- Conecta directamente con los principios de POO.


### Pilares estructurales

Hay cuatro elementos forman una jerarquía que define cómo se organiza cualquier aplicación JavaFX:

- Application: Clase abstracta que toda aplicación JavaFX debe extender. Obliga a implementar el método start(Stage primaryStage), punto de entrada de la app.
- Stage:	Representa la ventana de la aplicación (el contenedor de más alto nivel).
- Scene:	Representa el contenido que se muestra dentro del Stage en un momento dado. Puede cambiar de Scene, pero solo muestra una a la vez.
- Node:	clase base abstracta de todo elemento visual (botones, textos, imágenes, layouts). Todo lo que se ve en pantalla es un Node

----
Código en java

<img width="1944" height="848" alt="image" src="https://github.com/user-attachments/assets/15e56221-1550-4f54-866f-dc37735b964e" />

---
### ¿Qué son los controles? 

Componentes interactivos con los que el usuario se comunica con la aplicación: 
- Button
- Label
- TextField
- CheckBox
- ComboBox
- RadioButton

Todos son subclases de Node (heredan de Control, que a su vez hereda de Node), lo cual es un ejemplo directo de herencia.


### ¿Qué son los layouts (contenedores)?

Son clases que organizan visualmente a otros nodos dentro de la ventana. Ejemplos:

- VBox: organiza elementos en una columna vertical
- HBox: organiza elementos en una fila horizontal
- BorderPane: divide el espacio en top, bottom, left, right y center
- GridPane: organiza en una cuadrícula de filas y columnas
- StackPane: apila elementos uno sobre otro

Un layout también es un Node (específicamente hereda de Pane), y a la vez contiene otros Node dentro de sí 

---

### Eventos y setOnAction()
Un evento es una acción del usuario sobre la interfaz (clic, tecla presionada, movimiento del mouse). 

JavaFX maneja eventos mediante el patrón listener/callback.

El método setOnAction() se usa típicamente en controles como Button para definir qué código se ejecuta cuando ocurre la acción (por ejemplo, un clic):

Método en java

<img width="1944" height="438" alt="image" src="https://github.com/user-attachments/assets/92ff0b0d-ae45-4872-8594-00377c68989c" />


En este ejemplo, setOnAction() recibe un objeto que implementa la interfaz funcional EventHandler<ActionEvent>

---

### ¿Cómo se relaciona con programación orientada a objetos?

Las clases y objetos se representan en cada elemento visual como Button, Scene o Stage, estos son un objeto instanciado de una clase.

Vemos la herencia	en el ejemplo: "Application" es una clase abstracta que se extiende, por ello todos los controles y layouts heredan de Node.

Un Node puede ser tratado genéricamente sin importar si es un Button, un Label o un VBox, y ahí entra el pilar del polimorfismo.

Otro ejemplo son los atributos internos de cada control, que se acceden mediante métodos get/set. Ahpi entra el encapsulamiento con getText() o setText().

En resumen, JavaFX además de ser una herramienta gráfica, también es una aplicación completa de los principios de POO, porque cada ventana, botón y evento que se ve en pantalla es resultado de objetos que heredan, se comunican y colaboran entre sí.

----

### Diagrama conceptual

<img width="500" height="600" alt="Diagrama en blanco" src="https://github.com/user-attachments/assets/02b8c404-516f-4a5b-8a86-ed6019c6008e" />

---

### Programa de Registro de Estudiantes

Para esta actividad, primero se crea la clase Estudiantes, con sus atributos "nombreEstudiante" y "matriculaEstudiante", se inicializan en el constructor y se agregan métodos get y set, además de sobreescribir el método toString para imprimir los datos de los estudiantes.

Código Estudiante.java:

<img width="1277" height="727" alt="image" src="https://github.com/user-attachments/assets/39790b8d-b673-4055-ad47-86f0df6e2192" />

Salida:
<img width="1265" height="730" alt="image" src="https://github.com/user-attachments/assets/b8cb056e-9ffe-49a2-8f2c-3e25f4b1c65c" />

A continuación, hay que actualizar el Main.java por una versión con interfaz JavaFX:
- se crean 2 TextField de nombre y matrícula dentro de un VBox
- se agrega un Button con setOnAction()
- dentro del evento, se lee con getText() cada TextField y se crea el objeto Estudiante

---

Evidencias de ejecución

<img width="290" height="304" alt="image" src="https://github.com/user-attachments/assets/569288fd-8218-49f5-b928-ab7e5a345e1f" />

<img width="290" height="304" alt="image" src="https://github.com/user-attachments/assets/b587f52d-7162-4b2e-b3f7-5f90933c48f6" />

Para este punto, ya había mudado el proyecto original a un archivo JavaFX

---

### Usos de IA:
Para esta actividad me apoyé de la IA claude para familiarizarme con el entorno JavaFX, ya que al crear un proyecto de este tipo, encuentras muchos archivos y carpetas, por lo que no sabía en dónde iniciar el programa. También utilicé su guia para crear los layouts (vbox) y el stage scene.
