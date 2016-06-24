package com.br.involves.prototipo.microservice.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.involves.prototipo.microservice.web.spring.component.ParticipantesComponent;
import com.br.involves.prototipo.microservice.web.spring.mongodb.Customer;
import com.br.involves.prototipo.microservice.web.spring.mongodb.CustomerRepository;

@RestController@RequestMapping(value = "/participantes")
public class ParticipantesController {

	@Autowired
	private ParticipantesComponent participantesComponent;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping(value = "/nro", method = RequestMethod.GET)
	@ResponseBody
	public String retornaNroParticipantes(){
		
		
		customerRepository.deleteAll();
		customerRepository.save(new Customer("Alice1", "Smith1"));
		customerRepository.save(new Customer("Alice2", "Smith2"));
		customerRepository.save(new Customer("Alice3", "Smith3"));
		customerRepository.save(new Customer("Alice4", "Smith4"));
		
		for (Customer customer : customerRepository.findAll()) {
			System.out.println(customer);
		}
		
		return participantesComponent.getNroParticipantes();
	}
	
	@RequestMapping(value = "/forceError", method = RequestMethod.GET)
	@ResponseBody
	public String forceError(){
		throw new RuntimeException();
	}
}
