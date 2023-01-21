package com.ejemplo.ejercicio.controlador;

import com.ejemplo.ejercicio.entity.Profesor;
import com.ejemplo.ejercicio.repositorio.IProfesorRepositorio;
import com.ejemplo.ejercicio.service.ProfesorService;
import org.springframework.web.bind.annotation.*;

import com.ejemplo.ejercicio.dto.ProfesorDTO;
import com.ejemplo.ejercicio.service.IProfesorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.stream.Collectors;

import static com.ejemplo.ejercicio.repositorio.IProfesorRepositorio.*;

@RestController
@RequestMapping("/teacher")

public class ProfesorControlador {
    private final IProfesorService iProfesorService;
    private final IProfesorRepositorio iProfesorRepositorio;

    public ProfesorControlador(IProfesorService iProfesorService,
                               IProfesorRepositorio iProfesorRepositorio){
        this.iProfesorService = iProfesorService;
        this.iProfesorRepositorio = iProfesorRepositorio;
    }

    @GetMapping()
    /*
    public ResponseEntity <?> getProfesorAll(){
        return ResponseEntity.ok().body(this.iProfesorService.getAll());
    }
    */
    public List<ProfesorDTO> getAll(){
        List<Profesor> list = (List<Profesor>) iProfesorRepositorio.findAll();
        return list.stream()
                .map(ProfesorDTO::new)
                .collect(Collectors.toList());
    }

    @PostMapping()
    public ResponseEntity <?> saveProfesor(@RequestBody ProfesorDTO profesor){
        this.iProfesorService.save(profesor);
        return new ResponseEntity<>("Creado", HttpStatus.CREATED);
    }

}
