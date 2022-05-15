package com.candoit.springboot.backend.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.candoit.springboot.backend.apirest.models.dao.IAlumnoDao;
import com.candoit.springboot.backend.apirest.models.entity.Alumno;

@Service
public class AlumnoServiceImpl implements IAlumnoService {

	@Autowired
	private IAlumnoDao alumnoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findAll() {
		return (List<Alumno>) alumnoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Alumno findById(Long id) {
		return alumnoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
		return alumnoDao.save(alumno);
	}

	@Transactional
	@Override
	public void delete(Long id) {
		alumnoDao.deleteById(id);
	}

}
