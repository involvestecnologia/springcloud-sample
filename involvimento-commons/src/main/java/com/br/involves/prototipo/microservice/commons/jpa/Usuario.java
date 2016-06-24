package com.br.involves.prototipo.microservice.commons.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue
	private Long id;
	private String login;
	private String password;
	private String name;
	private Empresa dataSourceTable;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Empresa getDataSourceTable() {
		return dataSourceTable;
	}

	public void setDataSourceTable(Empresa dataSourceTable) {
		this.dataSourceTable = dataSourceTable;
	}

}
