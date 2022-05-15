package com.candoit.springboot.backend.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.candoit.springboot.backend.apirest.models.dao.ICursoDao;
import com.candoit.springboot.backend.apirest.models.entity.Curso;

@Service
public class CursoServiceImpl implements ICursoService {

	@Autowired
	private ICursoDao cursoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Curso> findAll() {
		return (List<Curso>) cursoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Curso findById(Long id) {
		return cursoDao.findById(id).orElse(null);
	}

}
