package com.ejemplo.ejercicio.dto;

import com.ejemplo.ejercicio.entity.Profesor;

public class ProfesorDTO {
    private String nombre;
    private String apellido;
    private int cedula;

    private int edad;

    private String materia;

    public ProfesorDTO() {
    }

    public ProfesorDTO(String nombre, String apellido, int cedula, int edad, String materia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.materia = materia;
    }

    public ProfesorDTO(Profesor profesor) {
        this.nombre = profesor.getNombre();
        this.apellido = profesor.getApellido();
        this.cedula = profesor.getCedula();
        this.edad = profesor.getEdad();
        this.materia = profesor.getMateria();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido() {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula() {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad() {
        this.edad = edad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria() {
        this.materia = materia;
    }

}
