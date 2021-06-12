package com.example.proyecto.controllers;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.entity.models.rol;
import com.example.proyecto.entity.models.usuario;
import com.example.proyecto.entity.services.IRolService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
@RestController
public class rolcontroller {
	
	
	

	
	
	
	
	@Autowired(required=true)
	private IRolService rolService;
	
	
	@GetMapping("/rol")
	public List<rol> getAllrol(){
		return rolService.getAll();
	}
	
	

}
