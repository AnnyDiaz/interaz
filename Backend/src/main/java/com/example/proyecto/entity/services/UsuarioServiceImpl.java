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
	public usuario post(usuario usuario) {

		System.out.print(usuario.getTipo_documento());
		System.out.print(usuario.getgenero());
		System.out.print(usuario.getrol());

		return usuarioDao.save(usuario);

	}

	@Override
	public usuario put(usuario usuario, long id) {
		usuarioDao.findById(id).ifPresent((x) -> {
			usuario.setId(id);
		});
		System.out.print(usuario.getTipo_documento());
		System.out.print(usuario.getgenero());
		System.out.print(usuario.getrol());

		return usuarioDao.save(usuario);

	}

	@Override
	public void delete(long id) {
		usuarioDao.deleteById(id);

	}

	@Override
	public usuario findUsuarioByUserPpassword(usuario usuario) {
		usuario user = usuarioDao.findUsuarioByUserPpassword(usuario.getCorreo(), usuario.getPassword());
		System.out.println(user.getDireccion());
		return user;

	}

	@Override
	public usuario findUsuarioByPassword(usuario usuario, long id) {
		usuario user = usuarioDao.findById(id).get();
		System.out.println(usuario.getPassword());
		if (user == null)
			return new usuario();
		else {
			user.setPassword(usuario.getPassword());

			return usuarioDao.save(user);
		}

	}

}
