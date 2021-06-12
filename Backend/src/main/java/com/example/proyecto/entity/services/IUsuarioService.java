package com.example.proyecto.entity.services;

import java.util.List;

import com.example.proyecto.entity.models.usuario;

public interface IUsuarioService {

	public usuario get(long id);
	public List<usuario> getAll();
	public usuario post(usuario usuario);
	public usuario put(usuario usuario, long id);
	public void delete(long id);
	public usuario findUsuarioByUserPpassword(usuario usuario);
	public usuario findUsuarioByPassword(usuario usuario, long id );
	

}
