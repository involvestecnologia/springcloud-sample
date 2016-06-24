package com.br.involves.prototipo.microservice.web.spring.component;

import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class ParticipantesComponent {

//	@HystrixCommand(fallbackMethod = "getNroParticipantesDefault")
    public String getNroParticipantes() {
        throw new RuntimeException();
    }

    public String getNroParticipantesDefault() {
        return "190";
    }
    
}
