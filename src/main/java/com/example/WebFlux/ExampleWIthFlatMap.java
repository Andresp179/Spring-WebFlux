package com.example.WebFlux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ExampleWIthFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Flux.fromArray(new String[]{"Tom","Melissa","Steve","Megan"})
         .flatMap(ExampleWIthFlatMap::ponerNombreModificadoEnMono)
         .subscribe(System.out::println);
	}
	 private static Mono<String> ponerNombreModificadoEnMono(String nombre){
	        return Mono.just(nombre.concat(" ponchero"));
	    }
}
