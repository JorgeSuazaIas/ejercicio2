package com.ejemplo.ejercicio.controlador;

import com.ejemplo.ejercicio.entity.Profesor;
import com.ejemplo.ejercicio.repositorio.IProfesorRepositorio;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.ejemplo.ejercicio.dto.ProfesorDTO;
import com.ejemplo.ejercicio.service.IProfesorService;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/v1/teacher", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProfesorControlador {
    private final IProfesorService iProfesorService;
    private final IProfesorRepositorio iProfesorRepositorio;

    public ProfesorControlador(IProfesorService iProfesorService,
                               IProfesorRepositorio iProfesorRepositorio) {
        this.iProfesorService = iProfesorService;
        this.iProfesorRepositorio = iProfesorRepositorio;
    }

    @PostMapping("/save-one")
    public ResponseEntity<Profesor> saveProfesor(@RequestBody Profesor profesor) {
        return ResponseEntity.ok(iProfesorService.save(profesor));
    }

    @GetMapping()
    public ResponseEntity<?> getProfesorAll() {
        return ResponseEntity.ok().body(this.iProfesorService.getAll());
    }

    public List<ProfesorDTO> getAll() {
        List<Profesor> list = (List<Profesor>) iProfesorRepositorio.findAll();
        return list.stream()
                   .map(ProfesorDTO::new)
                   .collect(Collectors.toList());
    }

}
