package com.example.proyecto.entity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.entity.dao.IRolDao;
import com.example.proyecto.entity.models.rol;

@Service
public class RolServiceImpl implements IRolService {

	@Autowired
	private IRolDao rolDao;
	
	@Override
	public rol get(long id) {
		return rolDao.findById(id).get();
	}

}
