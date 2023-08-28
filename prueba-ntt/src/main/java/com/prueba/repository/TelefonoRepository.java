package com.prueba.repository;

import org.springframework.data.repository.CrudRepository;
import com.prueba.entity.Telefono;

public interface TelefonoRepository extends CrudRepository<Telefono, Long> {
	Telefono findByNumero(String numero);
}
