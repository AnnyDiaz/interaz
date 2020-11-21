package com.example.proyecto.entity.services;

import java.util.List;

import com.example.proyecto.entity.models.documento;


public interface ITipo_DocumentoService {
	public documento get(long id);
	public List<documento> getAll();
	
}
