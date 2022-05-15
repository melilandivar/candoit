package com.candoit.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.candoit.springboot.backend.apirest.models.entity.Alumno;

public interface IAlumnoDao extends CrudRepository<Alumno, Long> {

}
