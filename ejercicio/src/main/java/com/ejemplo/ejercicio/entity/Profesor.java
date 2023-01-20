package com.ejemplo.ejercicio.entity;

import com.ejemplo.ejercicio.dto.ProfesorDTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity
public class Profesor {
    @Id
    private int cedula;
    @Column(nullable = false)
    private String nombre;
    private String apellido;




    private int edad;

    private String materia;

    public Profesor() {
    }

    public Profesor(ProfesorDTO profesor) {
    }

    public Profesor(String nombre, String apellido, int cedula, int edad, String materia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }


}
