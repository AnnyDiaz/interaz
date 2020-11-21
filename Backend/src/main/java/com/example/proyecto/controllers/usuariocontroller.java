package com.example.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.entity.models.usuario;
import com.example.proyecto.entity.services.IUsuarioService;

@RestController


public class usuariocontroller {

	@Autowired(required=true)
	private  IUsuarioService usuarioService;
	
	
	@GetMapping("/usuario")
	public List<usuario> getAllusuario(){
		
		return usuarioService.getAll();
	}
	
	@GetMapping("/usuario/{id}")
	public usuario getOne(@PathVariable(value = "id") long id) {
		return usuarioService.get(id);
	}
	
	
	
	
	@PostMapping("usuario")
	public void add(usuario usuario) {
		usuarioService.post(usuario);
	}
	
	@PutMapping("/usuario/{id}")
	public void update(usuario usuario, @PathVariable(value = "id") long id) {
		usuarioService.put(usuario, id);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void delete(@PathVariable(value = "id") long id) {
		usuarioService.delete(id);
	}
	
}
