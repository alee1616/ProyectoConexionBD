package com.example.proyectoconexionbd.model;

import java.time.LocalDate;
import java.math.BigDecimal;

public class Estudiante {
    private int id;
    private String nombre;
    private String correo;
    private String carrera;
    private String telefono;
    private int edad;
    private LocalDate fechaIngreso;
    private BigDecimal promedio;

    public Estudiante(int id, String nombre, String correo, String carrera,
                      String telefono, int edad, LocalDate fechaIngreso, BigDecimal promedio) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
        this.telefono = telefono;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
        this.promedio = promedio;
    }

    public Estudiante() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public BigDecimal getPromedio() {
        return promedio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setPromedio(BigDecimal promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", carrera='" + carrera + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                ", fechaIngreso=" + fechaIngreso +
                ", promedio=" + promedio +
                '}';
    }
}