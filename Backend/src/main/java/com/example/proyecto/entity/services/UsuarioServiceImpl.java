package com.example.proyecto.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.proyecto.entity.dao.IUsuarioDao;
import com.example.proyecto.entity.models.usuario;
import com.example.proyecto.entity.services.IUsuarioService;
@Service
public class UsuarioServiceImpl implements IUsuarioService {

	
	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	public usuario get(long id) {
		
		return usuarioDao.findById(id).get();
	}

	@Transactional(readOnly = true) 
	public List<usuario> getAll() {
		return (List<usuario>) usuarioDao.findAll();
	}
	
	
	
	
	@Override
	public void post(usuario usuario) {
		usuarioDao.save(usuario);
		
		
	}


	@Override
	public void put(usuario usuario, long id) {
		usuarioDao.findById(id).ifPresent((x)->{
			usuario.setId(id);
			usuarioDao.save(usuario);
		});
	}

	@Override
	public void delete(long id) {
		usuarioDao.deleteById(id);
		
	}

}
