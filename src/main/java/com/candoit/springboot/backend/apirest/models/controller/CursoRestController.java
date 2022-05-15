package com.candoit.springboot.backend.apirest.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.candoit.springboot.backend.apirest.models.entity.Curso;
import com.candoit.springboot.backend.apirest.models.service.ICursoService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CursoRestController {

	@Autowired
	private ICursoService cursoService;
	
	@GetMapping("/cursos")
	public List<Curso> index(){
		return cursoService.findAll();
	}
	
	@GetMapping("/cursos/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Curso show(@PathVariable Long id) {
		return cursoService.findById(id);
	}

}
