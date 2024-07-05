package com.example.WebFlux;

import reactor.core.publisher.Flux;

public class ExampleWIthFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flux.fromArray(new String[] {"Tom","Juan","Aura","Diana","Mauricio"})
		.filter(nombre->nombre.length()==3)
		.map(String::toUpperCase)
        .subscribe(System.out::println);
        
	}

}
