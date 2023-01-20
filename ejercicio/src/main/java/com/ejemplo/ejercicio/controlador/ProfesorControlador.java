package com.ejemplo.ejercicio.controlador;

import com.ejemplo.ejercicio.entity.Profesor;
import org.springframework.web.bind.annotation.*;

import com.ejemplo.ejercicio.dto.ProfesorDTO;
import com.ejemplo.ejercicio.service.IProfesorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/profesor")

public class ProfesorControlador {
    private final IProfesorService iProfesorService;

    public ProfesorControlador(IProfesorService iProfesorService){
        this.iProfesorService = iProfesorService;
    }

    @GetMapping()
    public ResponseEntity <?> getProfesorAll(){
        return ResponseEntity.ok().body(this.iProfesorService.getAll());
    }

    @PostMapping()
    public ResponseEntity <?> saveProfesor(@RequestBody ProfesorDTO profesor){
        this.iProfesorService.save(profesor);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
