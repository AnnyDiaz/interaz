package com.example.proyecto.entity.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.entity.dao.ICertificadoDao;
import com.example.proyecto.entity.models.certificado;

@Service
public class CertificadoServiceImpl implements ICertificadoService {

	
	@Autowired
	private ICertificadoDao certificadoDao;
	
	
	@Override
	public certificado get(long id) {
		
		return certificadoDao.findById(id).get();
	}

		
	@Transactional(readOnly = true) 
	public List<certificado> getCertificados() {
		return (List<certificado>) certificadoDao.findAll();
}

	@Override
	public List<certificado> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public certificado post(certificado certificado) {
		System.out.print(certificado.getUsuario());
		
		return	certificadoDao.save(certificado);
		
	}

	@Override
	public certificado put(certificado certificado, long id) {

		certificadoDao.findById(id).ifPresent((x)->{
			certificado.setId(id);
			certificadoDao.save(certificado);
		});
		
		System.out.print(certificado.getUsuario());
	
		return	certificadoDao.save(certificado);

	}

	@Override
	public void delete(long id) {
		certificadoDao.deleteById(id);
		
	}

}
