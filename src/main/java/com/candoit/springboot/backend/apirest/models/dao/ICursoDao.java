package com.candoit.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.candoit.springboot.backend.apirest.models.entity.Curso;

public interface ICursoDao extends CrudRepository<Curso, Long> {

}
