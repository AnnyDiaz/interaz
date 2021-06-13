package com.example.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.entity.models.documento;


import com.example.proyecto.entity.services.ITipo_DocumentoService;

@RestController
public class tipo_documentocontroller{
	
	@Autowired
	ITipo_DocumentoService ITipo_DocumentoService;
	
	@Autowired(required=true)
	private ITipo_DocumentoService tipo_doctumentoService;
	
	
	@GetMapping("/tipo_documento")
	public List<documento> getAllrol(){
		return ITipo_DocumentoService.getAll();
	}
	
	
}
