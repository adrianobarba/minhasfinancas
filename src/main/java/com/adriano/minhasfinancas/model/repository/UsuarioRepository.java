package com.adriano.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriano.minhasfinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
