package com.example.proyecto.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.proyecto.entity.models.usuario;

public interface IUsuarioDao extends CrudRepository<usuario, Long>  {

}
