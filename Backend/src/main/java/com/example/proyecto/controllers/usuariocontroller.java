package com.example.proyecto.controllers;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.entity.models.usuario;
import com.example.proyecto.entity.services.IUsuarioService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})

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
	
	
	 @PostMapping("/usuario")
	    public usuario create(@RequestBody usuario usuario) {
		 return usuarioService.post(usuario);
				        
	 }
	 
	
	@PutMapping("/usuario/{id}")
	public usuario update (@PathVariable long id, @RequestBody usuario usuario) {
		return usuarioService.put(usuario, id);
		
		
	}
		

	@DeleteMapping("/usuario/{id}")
	public void delete(@PathVariable(value = "id") long id) {
		usuarioService.delete(id);
	}
	
	@PostMapping("/login")
    public usuario usuario(@RequestBody usuario usuario) {
		
	 return usuarioService.findUsuarioByUserPpassword(usuario);
			        
 }
	
	
	@PutMapping("/login/{id}")
	public usuario usuario (@PathVariable long id, @RequestBody usuario usuario ) {
		return usuarioService.findUsuarioByPassword(usuario,id);
	}
	
}
