package com.ejemplo.ejercicio.repositorio;

import com.ejemplo.ejercicio.dto.ProfesorDTO;
import com.ejemplo.ejercicio.entity.Profesor;
import org.springframework.data.repository.CrudRepository;
public interface IProfesorRepositorio extends CrudRepository<Profesor, Integer> {
    Profesor save(ProfesorDTO profesor);
}
