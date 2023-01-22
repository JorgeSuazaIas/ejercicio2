package com.ejemplo.ejercicio.service;
import com.ejemplo.ejercicio.dto.ProfesorDTO;
import com.ejemplo.ejercicio.entity.Profesor;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

public interface IProfesorService {
    Profesor save(Profesor profesor);

    void update(ProfesorDTO profesor);

    ArrayList<ProfesorDTO> getAll();

    void delete(ProfesorDTO profesor);
}
