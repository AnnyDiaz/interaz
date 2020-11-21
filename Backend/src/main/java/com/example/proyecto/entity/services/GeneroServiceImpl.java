package com.example.proyecto.entity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.entity.dao.IGeneroDao;
import com.example.proyecto.entity.models.genero;

@Service

public class GeneroServiceImpl implements IGeneroService{
	
	@Autowired
	private IGeneroDao generoDao;

	@Override
	public genero get(long id) {
		return generoDao.findById(id).get();
	}

}
