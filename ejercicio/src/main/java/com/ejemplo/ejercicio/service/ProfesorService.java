package com.ejemplo.ejercicio.service;

import com.ejemplo.ejercicio.dto.ProfesorDTO;
import com.ejemplo.ejercicio.entity.Profesor;
import com.ejemplo.ejercicio.repositorio.IProfesorRepositorio;
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
    public void save(ProfesorDTO profesor){
        this.iProfesorRepositorio.save(new Profesor(profesor));
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
    public void delete(){

    }
    /*//Aqui los estoy listando
    private List<Profesor> profesors;
    public ProfesorService(){
        profesors = new ArrayList<>();
        profesors.add(new Profesor("Jorge","Suaza" ,12345, 20, "Ciencias"));
        profesors.add(new Profesor("Jose", "Baena", 54321, 30, "Matematicas"));
        profesors.add(new Profesor("Claudia","Cifuentes", 21435, 40, "Ingles"));

    }
    public List<Profesor> list(){
        return profesors;
    }

    //Aqui los estoy buscando y verifico si la cedula coincide

    public Profesor buscarProfesor(int cedula){
        for(Profesor profesor : profesors){
            if (profesor.getCedula() == cedula){
                return profesor;
            }
        }
        return null;
    }

    //Aqui lo estoy creando

    public Profesor creaProfesor(Profesor profesor){
        profesors.add(profesor);
        return profesor;
    }

    //Aqui lo actualizo

    public Profesor actualizarProfesor(int cedula, Profesor profesor){
        int indice = 0;
        for (Profesor p: profesors){
            if (p.getCedula() == cedula){
                profesor.setCedula(cedula);
                profesors.set(indice, profesor);
            }
        }
        return profesor;
    }

    //Aqui lo elimino

    public boolean eliminar(int cedula){
        for(Profesor e : profesors){
            if (e.getCedula() == cedula){
                return profesors.remove(e);
            }
        }
        return false;
    }*/

}
