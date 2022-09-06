package com.example.Guia3PaolaCriollo.model;

public class Estudiante {

    private Long id;
    private String nombre;
    private String correo_electronico;
    private int numero_estudiante;
    private String cursoLista;
    private double gpa;

    public Estudiante() {
    }

    public Estudiante(Long id, String nombre, String correo_electronico, int numero_estudiante, String cursoLista, double gpa) {
        this.id = id;
        this.nombre = nombre;
        this.correo_electronico = correo_electronico;
        this.numero_estudiante = numero_estudiante;
        this.cursoLista = cursoLista;
        this.gpa = gpa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public int getNumero_estudiante() {
        return numero_estudiante;
    }

    public void setNumero_estudiante(int numero_estudiante) {
        this.numero_estudiante = numero_estudiante;
    }

    public String getCursoLista() {
        return cursoLista;
    }

    public void setCursoLista(String cursoLista) {
        this.cursoLista = cursoLista;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
