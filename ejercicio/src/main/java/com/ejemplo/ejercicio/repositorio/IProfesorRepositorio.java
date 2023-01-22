package com.ejemplo.ejercicio.repositorio;

import com.ejemplo.ejercicio.entity.Profesor;
import org.springframework.data.repository.CrudRepository;
public interface IProfesorRepositorio extends CrudRepository<Profesor, Integer> {
    /*private void saveProfesors(){
        Profesor profesor1 = new Profesor("Jorge","Suaza", 12345, 25,"Programacion");
    }*/


}
