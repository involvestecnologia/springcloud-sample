package com.br.involves.prototipo.microservice.gateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.involves.prototipo.microservice.commons.jpa.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	@Query("from Usuario obj where obj.login = ?1 ")
	Usuario findByLogin(String login);

}
