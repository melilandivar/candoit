package com.candoit.springboot.backend.apirest.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.candoit.springboot.backend.apirest.models.entity.Alumno;
import com.candoit.springboot.backend.apirest.models.service.IAlumnoService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class AlumnoRestController {

	@Autowired
	private IAlumnoService alumnoService;
	
	@GetMapping("/alumnos")
	public List<Alumno> index(){
		return alumnoService.findAll();
	}
	
	@GetMapping("/alumnos/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Alumno show(@PathVariable Long id) {
		return alumnoService.findById(id);
	}
	
	@PostMapping("/alumnos")
	@ResponseStatus(HttpStatus.CREATED)
	public Alumno create(@RequestBody Alumno alumno) {
		return alumnoService.save(alumno);
	}
	
	@PutMapping("/alumnos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Alumno update (@RequestBody Alumno alumno, @PathVariable Long id) {
		Alumno alumnoActual = alumnoService.findById(id);
		
		alumnoActual.setApellido(alumno.getApellido());
		alumnoActual.setNombre(alumno.getNombre());
		alumnoActual.setEmail(alumno.getEmail());
		return alumnoService.save(alumnoActual);
	}
	
	@DeleteMapping("/alumnos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable Long id) {
		alumnoService.delete(id);
	}
}
