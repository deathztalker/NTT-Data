package com.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findByCorreo(String correo);
	Usuario findByCorreoAndContrasena(String correo, String contrasena);
}
