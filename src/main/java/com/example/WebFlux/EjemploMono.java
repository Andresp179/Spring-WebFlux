package com.example.WebFlux;

import javax.management.RuntimeErrorException;

import reactor.core.publisher.Mono;

public class EjemploMono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Mono<String> monin = Mono.fromSupplier(() ->{
			throw new RuntimeException("Hay un error!!");
			
		});
		monin.subscribe(err -> System.out.println(err));
		
		Mono<String> prueba=Mono.just("Andres Arturo Perez");
		prueba.subscribe(data -> System.out.println("El nombre es: "+data),
				         err -> System.out.println(err),
				         () -> System.out.println("Complete!.."));
	}

}
