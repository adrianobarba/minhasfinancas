package com.adriano.minhasfinancas.service.impl;

import com.adriano.minhasfinancas.model.entity.Usuario;
import com.adriano.minhasfinancas.model.repository.UsuarioRepository;
import com.adriano.minhasfinancas.service.UsuarioService;

public class UsuarioSeviceImpl implements UsuarioService {
	
	private UsuarioRepository repository;
	
	
	public UsuarioSeviceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		// TODO Auto-generated method stub
		
	}

}
