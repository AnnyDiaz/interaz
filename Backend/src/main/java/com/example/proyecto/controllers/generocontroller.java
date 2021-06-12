package com.example.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.entity.models.genero;
import com.example.proyecto.entity.models.rol;
import com.example.proyecto.entity.services.IGeneroService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})

public class generocontroller {
	
	@Autowired(required=true)
	private IGeneroService generoService;
	
	@GetMapping("/genero")
	public List<genero> getAllrol(){
		return generoService.getAll();
	}
}
