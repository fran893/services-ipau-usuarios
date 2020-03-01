package com.app.ipau.usuarios.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.ipau.commons.usuarios.models.entities.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);

}
