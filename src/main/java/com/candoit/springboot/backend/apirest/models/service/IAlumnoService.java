package com.candoit.springboot.backend.apirest.models.service;

import java.util.List;

import com.candoit.springboot.backend.apirest.models.entity.Alumno;

public interface IAlumnoService {

	public List<Alumno> findAll();
	
	public Alumno findById(Long id);
	
	public Alumno save (Alumno alumno);
	
	public void delete(Long id);
}
