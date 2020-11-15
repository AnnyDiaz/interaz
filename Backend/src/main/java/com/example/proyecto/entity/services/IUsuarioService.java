package com.example.proyecto.entity.services;

import java.util.List;

import com.example.proyecto.entity.models.usuario;

public interface IUsuarioService {

	
	public usuario get(long id);
	public List<usuario> getAll();
	public void post(usuario usuario);
	public void put(usuario usuario, long id);
	public void delete(long id);
	

}
