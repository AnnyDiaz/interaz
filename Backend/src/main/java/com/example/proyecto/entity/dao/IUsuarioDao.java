package com.example.proyecto.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.proyecto.entity.models.usuario;

public interface IUsuarioDao extends CrudRepository<usuario, Long>  {
	
	public usuario findUsuarioById(String id);
	public usuario findUsuarioByName( String name);
	public usuario findUsuarioByTelefono(String telefono);
	public usuario findUsuarioByDireccion(String direccion);
	public usuario findUsuarioByCorreo(String correo);
	public usuario findUsuarioByPassword(String password);
	public usuario findUsuarioByRol(String rol);
	public usuario findUsuarioByGenero(String genero);
	public usuario findUsuarioByTipo_documento(String tipo_documento);
	public usuario findUsuarioByUserPpassword(String correo, String password);
	
}
