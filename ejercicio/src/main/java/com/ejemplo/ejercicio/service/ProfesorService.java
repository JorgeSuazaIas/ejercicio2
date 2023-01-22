package com.ejemplo.ejercicio.service;

import com.ejemplo.ejercicio.dto.ProfesorDTO;
import com.ejemplo.ejercicio.entity.Profesor;
import com.ejemplo.ejercicio.repositorio.IProfesorRepositorio;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfesorService implements IProfesorService {

    private  IProfesorRepositorio iProfesorRepositorio ;

    public ProfesorService(IProfesorRepositorio iProfesorRepositorio){
        this.iProfesorRepositorio = iProfesorRepositorio;
    }

    @Override
    public Profesor save(Profesor profesor){
        return iProfesorRepositorio.save(profesor);
    }

    @Override
    public void update(ProfesorDTO profesor){
        if (this.iProfesorRepositorio.existsById(profesor.getCedula())){
            this.iProfesorRepositorio.save(new Profesor(profesor));
        }
    }


   @Override
    public ArrayList<ProfesorDTO> getAll(){
        List<Profesor> list = (List<Profesor>) this.iProfesorRepositorio.findAll();
        return (ArrayList<ProfesorDTO>) list.stream().map(ProfesorDTO::new).collect(Collectors.toList());
    }

    @Override
    public void delete(ProfesorDTO profesor) {
        if(this.iProfesorRepositorio.existsById(profesor.getCedula())){
            iProfesorRepositorio.deleteById(profesor.getCedula());
        }

       }


    }



