package com.ejemplo.ejercicio;

import com.ejemplo.ejercicio.controlador.ProfesorControlador;
import com.ejemplo.ejercicio.dto.ProfesorDTO;
import com.ejemplo.ejercicio.entity.Profesor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioApplication {

	public static void main(String[] args) {

		SpringApplication.run(EjercicioApplication.class, args);



	}
	private void saveProfesors(){
		Profesor profesor1 = new Profesor("Jorge", "Suaza", 1234, 20, "Ciencias" );
		Profesor profesor2 = new Profesor("Jose", "Baena", 5678, 31, "Matematicas" );
		Profesor profesor3 = new Profesor("Stiven", "Cardona", 91011, 42, "Ingles" );
		Profesor profesor4 = new Profesor("Sebastian", "Osorio", 12131, 53, "Geografia" );
		Profesor profesor5 = new Profesor("Anderson", "Echeverri", 41516, 64, "Español" );


	}


}
