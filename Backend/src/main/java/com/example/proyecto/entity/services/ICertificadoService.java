package com.example.proyecto.entity.services;



import java.util.List;


import com.example.proyecto.entity.models.certificado;


public interface ICertificadoService  {
	public certificado get(long id);
	public List<certificado> getAll();
	public certificado post(certificado certificado);
	public certificado put(certificado certificado, long id);
	public void delete(long id);
}
