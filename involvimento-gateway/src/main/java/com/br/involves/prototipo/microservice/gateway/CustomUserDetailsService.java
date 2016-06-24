package com.br.involves.prototipo.microservice.gateway;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.br.involves.prototipo.microservice.commons.config.CustomUserDetails;
import com.br.involves.prototipo.microservice.commons.jpa.Empresa;
import com.br.involves.prototipo.microservice.commons.jpa.Usuario;
import com.br.involves.prototipo.microservice.commons.repository.EmpresaRepository;
import com.br.involves.prototipo.microservice.gateway.repository.UsuarioRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private EmpresaRepository empRepo;

	@Autowired
	private UsuarioRepository userRepo;

	@Override
	public CustomUserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		Usuario user = userRepo.findByLogin(email);

		if (user == null) {
			return null;
		}

		List<GrantedAuthority> auth = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");

		Empresa empresa = empRepo.findOne(user.getDataSourceTable().getId());

		return new CustomUserDetails(user.getLogin(), user.getPassword(), auth, empresa);
	}

}
