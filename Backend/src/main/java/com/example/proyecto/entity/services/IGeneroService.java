package com.example.proyecto.entity.services;

import java.util.List;

import com.example.proyecto.entity.models.genero;
import com.example.proyecto.entity.models.rol;


public interface IGeneroService {
	
	public genero get(long id);

	public List<genero> getAll();
	
}
