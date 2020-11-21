package com.example.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.entity.models.rol;

import com.example.proyecto.entity.services.IRolService;


@RestController
public class rolcontroller {
	
	@Autowired(required=true)
	private IRolService rolService;
	
	
	@GetMapping("/rol")
	public List<rol> getAllrol(){
		return rolService.getAll();
	}
	
	

}
