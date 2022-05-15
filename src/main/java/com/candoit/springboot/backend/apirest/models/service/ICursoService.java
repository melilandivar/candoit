package com.candoit.springboot.backend.apirest.models.service;

import java.util.List;

import com.candoit.springboot.backend.apirest.models.entity.Curso;

public interface ICursoService {

	public List<Curso> findAll();
	
	public Curso findById(Long id);
	
}
