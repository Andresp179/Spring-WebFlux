package com.example.WebFlux;

import reactor.core.publisher.Flux;

public class FluxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flux <String> flux= Flux.fromArray(new String[] {"Andres","Arturo","Perez"});
		flux.subscribe(System.out::println);
		System.out.println("====================");
		flux.doOnNext(System.out::println).subscribe();

	}

}
