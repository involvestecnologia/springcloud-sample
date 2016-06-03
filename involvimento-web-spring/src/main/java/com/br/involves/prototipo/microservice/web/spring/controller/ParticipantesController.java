package com.br.involves.prototipo.microservice.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.involves.prototipo.microservice.web.spring.component.ParticipantesComponent;

@RestController@RequestMapping(value = "/participantes")
public class ParticipantesController {

	@Autowired
	private ParticipantesComponent participantesComponent;
	
	@RequestMapping(value = "/nro", method = RequestMethod.GET)
	@ResponseBody
	public String retornaNroParticipantes(){
		return participantesComponent.getNroParticipantes();
	}
	
	@RequestMapping(value = "/forceError", method = RequestMethod.GET)
	@ResponseBody
	public String forceError(){
		throw new RuntimeException();
	}
}
