package com.example.proyecto.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.proyecto.entity.models.documento;

public interface ITipo_DocumentoDao extends CrudRepository <documento, Long> {

}
