package com.example.proyecto.entity.services;

import java.util.List;

import com.example.proyecto.entity.models.rol;

public interface IRolService {
	
	public rol get(long id);
	public List<rol> getAll();

	
	

}
