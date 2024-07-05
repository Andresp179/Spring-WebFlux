package com.example.WebFlux;

import reactor.core.publisher.Flux;

public class ExampleMapFlujos {

	public static void main(String[] args) {
		
		Flux.fromArray(new String[] {"Tom","Juan","Aura","Diana"})
		                            .map(String::toUpperCase)
		                            .subscribe(System.out::println);

	}

}
