package com.example.proyecto.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.proyecto.entity.dao.IRolDao;
import com.example.proyecto.entity.models.rol;
import com.example.proyecto.entity.models.usuario;

@Service
public class RolServiceImpl implements IRolService {

	@Autowired
	private IRolDao rolDao;
	
	@Override
	public rol get(long id) {
		return rolDao.findById(id).get();
	}


	@Transactional(readOnly = true) 
	public List<rol> getAll() {
		return (List<rol>) rolDao.findAll();
	}
	
	
	

}
