package com.app.ipau.usuarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.ipau.commons.usuarios.models.entities.Usuario;
import com.app.ipau.usuarios.models.services.IUsuario;

@RestController
public class UsuarioController {

	@Autowired
	private IUsuario usuarioService;
	
	@GetMapping("/listarUsuarios")
	public List<Usuario> listarUsuarios(){
		return usuarioService.findAll();
	}
	
	@GetMapping("/getUser/{id}")
	public Usuario getUser(@PathVariable Long id) {
		return usuarioService.findById(id);
	}
	
	@GetMapping("/getUsername/{username}")
	public Usuario getUsername(@PathVariable String username) {
		return usuarioService.findByUsername(username);
	}
	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario crear(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@PutMapping("/updateUser/{idUser}")
	public Usuario actualizar(@RequestBody Usuario usuario, @PathVariable Long idUser) {
		Usuario usuarioDb = usuarioService.findById(idUser);
		usuarioDb.setApellido(usuario.getApellido());
		usuarioDb.setEmail(usuario.getEmail());
		usuarioDb.setEnabled(usuario.getEnabled());
		usuarioDb.setIntentos(usuario.getIntentos());
		usuarioDb.setNombre(usuario.getNombre());
		return usuarioService.save(usuarioDb);
	}
	
	
	
}
