package com.example.registroestudiante;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Crear los controles
        Label tituloLabel = new Label("R E G I S T R O   D E   E S T U D I A N T E S");

        Label nombreLabel = new Label("[ Nombre ]");
        TextField nombreField = new TextField();

        Label matriculaLabel = new Label("[ Matrícula ]");
        TextField matriculaField = new TextField();

        Button registrarBtn = new Button("= Registrar =");

        Label resultadoLabel = new Label(""); // aquí se muestra el objeto Estudiante

        // Evento del botón
        registrarBtn.setOnAction(evento -> {
            //primero se lee lo que el usuario escribió en los TextField
            String nombre = nombreField.getText();
            String matricula = matriculaField.getText();

            //despues se crea el objeto Estudiante usando el constructor de la clase Estudiante
            Estudiante e1 = new Estudiante(nombre, matricula);

            //se muestra el resultado usando los getters del objeto
            resultadoLabel.setText(
                    "Alumno registrado:\n" + "[ Nombre ] - " + e1.getNombreEstudiante() + "\n[ Matrícula ] - " + e1.getMatriculaEstudiantes()
            );

            //limpiar los campos para un nuevo registro
            nombreField.clear();
            matriculaField.clear();
        });

        // --- Layout (VBox) ---
        VBox root = new VBox(10); // 10 = espacio entre elementos
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER_LEFT);
        root.getChildren().addAll(
                tituloLabel,
                nombreLabel, nombreField,
                matriculaLabel, matriculaField,
                registrarBtn,
                resultadoLabel
        );

        // --- Scene y Stage ---
        Scene escena = new Scene(root, 320, 300);
        primaryStage.setScene(escena);
        primaryStage.setTitle("Registro de Estudiantes");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
