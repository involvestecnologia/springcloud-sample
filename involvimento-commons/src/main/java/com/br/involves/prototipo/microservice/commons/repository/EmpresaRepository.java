package com.br.involves.prototipo.microservice.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.involves.prototipo.microservice.commons.jpa.Empresa;
import com.br.involves.prototipo.microservice.commons.jpa.Usuario;
import com.msv.bunny.core.config.DataSourceConfigRepository;

@Repository
public interface EmpresaRepository extends DataSourceConfigRepository<Empresa>, JpaRepository<Empresa, Long> {

}