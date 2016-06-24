package com.br.involves.prototipo.microservice.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.context.annotation.ComponentScan;

@EnableSidecar
@SpringBootApplication
//@LoadDataSourceConfig(config=Empresa.class, configRepository=EmpresaRepository.class)
@ComponentScan(basePackages={
		"com.br.involves.prototipo.microservice.commons.repository"}
)
@EntityScan(basePackages={"com.br.involves.prototipo.microservice.commons.jpa"})
@EnableOAuth2Sso
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
}