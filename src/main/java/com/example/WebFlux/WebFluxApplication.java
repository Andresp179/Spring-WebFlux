package com.example.WebFlux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.*;
@SpringBootApplication
public class WebFluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFluxApplication.class, args);
		System.out.println("Hello world Spring Boot");
		
		
		List<Integer> elementsMono= new ArrayList<>();
		List<Integer> elementsFlux = new ArrayList<>();
		
		//Se crea un Mono
		Mono<Integer> monoExample= Mono.just(121);
	
		// se crea el flux
	    Flux<Integer> fluxExample =Flux.just(12,3,2,1,22,109,72);
	    
	    //suscripcion al mono
	    monoExample.subscribe(elementsMono::add);
	 
	    fluxExample.subscribe(elementsFlux::add);
	    
	    System.out.println(elementsFlux);
	    System.out.println(elementsMono);
	}

}
