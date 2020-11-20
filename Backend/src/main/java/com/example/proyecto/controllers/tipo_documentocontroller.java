package com.example.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.entity.models.documento;
import com.example.proyecto.entity.services.ITipo_DocumentoService;

@RestController
public class tipo_documentocontroller{
	
	@Autowired
	ITipo_DocumentoService tipo_documentoService;
	
	@GetMapping("/tipo_documento/{id}")
	public documento getOne(@PathVariable(value= "id") long id) {
		return tipo_documentoService.get(id);
	}

}
