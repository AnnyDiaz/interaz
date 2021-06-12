package com.example.proyecto.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.proyecto.entity.dao.IGeneroDao;
import com.example.proyecto.entity.dao.IRolDao;
import com.example.proyecto.entity.dao.IUsuarioDao;
import com.example.proyecto.entity.models.genero;
import com.example.proyecto.entity.models.rol;
import com.example.proyecto.entity.models.usuario;

@Service

public class GeneroServiceImpl implements IGeneroService{
	@Autowired
	private IGeneroDao generoDao;
	
	@Override
	public genero get(long id) {
		return generoDao.findById(id).get();
	}


	@Transactional(readOnly = true) 
	public List<genero> getAll() {
		return (List<genero>) generoDao.findAll();
	}
	
	

}
