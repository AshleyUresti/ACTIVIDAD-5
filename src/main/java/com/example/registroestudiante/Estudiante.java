package com.example.registroestudiante;

public class Estudiante {
    //atributos
    private String nombreEstudiante;
    private String matriculaEstudiantes;

    //constructor
    public Estudiante (String nombreEstudiante, String matriculaEstudiantes) {
        this.nombreEstudiante = nombreEstudiante;
        this.matriculaEstudiantes = matriculaEstudiantes;
    }

    //setters
    public void setNombreEstudiante (String nuevoNombre) {
        this.nombreEstudiante = nuevoNombre;
    }
    public void setMatriculaEstudiantes (String nuevaMatricula) {
        this.matriculaEstudiantes = nuevaMatricula;
    }

    //getters
    public String getNombreEstudiante () {
        return this.nombreEstudiante;
    }
    public String getMatriculaEstudiantes () {
        return this.matriculaEstudiantes;
    }

    //metodo sobreescrito
    @Override
    public String toString() {
        return "\n[ Nombre ] - " + nombreEstudiante + " | [ Matricula ] - " + matriculaEstudiantes;
    }
}
