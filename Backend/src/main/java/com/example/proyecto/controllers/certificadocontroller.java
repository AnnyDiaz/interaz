package com.example.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.proyecto.entity.models.certificado;
import com.example.proyecto.entity.services.ICertificadoService;

public class certificadocontroller {

	
	@Autowired(required=true)
	private  ICertificadoService certificadoService;
	
	
	@GetMapping("/contrato")
	public List<certificado> getAllcontrato(){
		
		return certificadoService.getAll();
	}
	
	@GetMapping("/contrato/{id}")
	public certificado getOne(@PathVariable(value = "id") long id) {
		return certificadoService.get(id);
	}
	

	@PostMapping("/contrato")
    public certificado create(@RequestBody certificado certificado) {
	 return certificadoService.post(certificado);
	}
	
	@PutMapping("/contrato/{id}")
	public certificado update (@PathVariable long id, @RequestBody certificado certificado) {
		return certificadoService.put(certificado, id);	
		
	}
	
	@DeleteMapping("/contrato/{id}")
	public void delete(@PathVariable(value = "id") long id) {
		 certificadoService.delete(id);
	}
}
