package com.ejemplo.ejercicio.service;
import com.ejemplo.ejercicio.dto.ProfesorDTO;

import java.util.ArrayList;
import java.util.List;

public interface IProfesorService {
    void save(ProfesorDTO profesor);

    void update(ProfesorDTO profesor);

    ArrayList<ProfesorDTO> getAll();

    void delete();
}
