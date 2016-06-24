package com.br.involves.prototipo.microservice.commons.config;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.br.involves.prototipo.microservice.commons.jpa.Empresa;
import com.msv.bunny.core.config.DataSourceConfig;
import com.msv.bunny.core.config.DataSourceConfigSecurity;

public class CustomUserDetails  extends User implements DataSourceConfigSecurity{

	private static final long serialVersionUID = 3375988537129735478L;
	private static final SimpleDateFormat DATA = new SimpleDateFormat("dd/MM/yyyy");
	private static final SimpleDateFormat HORA = new SimpleDateFormat("hh:mm:ss");
	
	private Empresa empresa;
	private Date horaLogada = new Date();
	
	public CustomUserDetails(String login, String senha, List<GrantedAuthority> auth, Empresa empresa) {
		super(login, senha, auth);
		this.empresa = empresa;
	}

	public long getIdEmpresa() {
		return empresa.getId();
	}

	@Override
	public DataSourceConfig getDataSourceConfig() {
		return empresa;
	}

	public String getDataLogado(){
		return DATA.format(horaLogada);
	}

	public String getHoraLogado(){
		return HORA.format(horaLogada);
	}
}
