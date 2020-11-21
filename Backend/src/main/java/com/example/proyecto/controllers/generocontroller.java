package com.example.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.entity.models.genero;
import com.example.proyecto.entity.services.IGeneroService;

@RestController
public class generocontroller {
	
	@Autowired(required=true)
	private IGeneroService generoService;
	
	@GetMapping("/genero/{id}")
	public genero getOne(@PathVariable(value = "id") long id) {
		return generoService.get(id);
	}

}
