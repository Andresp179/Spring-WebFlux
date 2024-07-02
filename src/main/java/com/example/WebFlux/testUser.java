package com.example.WebFlux;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import reactor.core.publisher.Flux;

public class testUser {
	
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(testUser.class);
	public static void main(String[] args) {
		
		  Flux<String> nombres = Flux.just("Christian Ramirez","Mery Ramirez","Biaggio cjava","Julen Oliva","Adrian Ramirez","Steven Oliva","Makol Ramirez");
	        Flux<User>  usuarios = nombres.map(nombre -> new User(nombre.split(" ")[0].toUpperCase(),nombre.split(" ")[1].toUpperCase()))
	                .filter(usuario -> !usuario.getApellido().equalsIgnoreCase("cjava"))
	                .doOnNext(usuario -> {
	                    if(usuario == null){
	                        throw new RuntimeException("Los nombres no pueden estar vacios");
	                    }
	                    System.out.println(usuario.getNombre().concat(" ").concat(usuario.getApellido()));
	                })
	                .map(usuario -> {
	                   String nombre = usuario.getNombre().toLowerCase();
	                   usuario.setNombre(nombre);
	                   return usuario;
	                });

	        usuarios.subscribe(e -> log.info(e.toString()), error -> log.error(error.getMessage()), new Runnable() {
	            @Override
	            public void run() {
	                log.info("Se la finalizado la ejecución del observable con éxito !");
	            }
	        });
	    }
}
