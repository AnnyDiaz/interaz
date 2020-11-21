package com.example.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.entity.models.rol;
import com.example.proyecto.entity.services.IRolService;

@RestController
public class rolcontroller {
	
	@Autowired(required=true)
	private IRolService rolService;
	
	
	@GetMapping("/rol/{id}")
	public rol getOne(@PathVariable(value = "id") long id){
		return rolService.get(id);
	}

	

}
