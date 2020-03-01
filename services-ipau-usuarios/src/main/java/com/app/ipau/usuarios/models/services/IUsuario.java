package com.app.ipau.usuarios.models.services;

import java.util.List;

import com.app.ipau.commons.usuarios.models.entities.Usuario;

public interface IUsuario {
	
	public List<Usuario> findAll();
	
	public Usuario findById(Long id);
	
	public Usuario save(Usuario usuario);
	
	public Usuario findByUsername(String username);

}
