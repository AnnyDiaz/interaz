package com.example.proyecto.entity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.entity.dao.ITipo_DocumentoDao;
import com.example.proyecto.entity.models.documento;

@Service
public class Tipo_DocumentoServiceImpl implements ITipo_DocumentoService {

	@Autowired
	private ITipo_DocumentoDao tipo_documentoDao;
	
	@Override
	public documento get(long id) {
		return tipo_documentoDao.findById(id).get();
		
	}

}
