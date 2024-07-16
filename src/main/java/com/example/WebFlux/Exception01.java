package com.example.WebFlux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Exception01 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Flux.just(2,7,10)
         .concatWith(Flux.error(new RuntimeException("Exception ocurred")))
         .concatWith(Mono.just(12))
         .onErrorReturn(72)
         .log()
         .subscribe();
	}

}
