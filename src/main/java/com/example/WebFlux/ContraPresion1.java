package com.example.WebFlux;

import reactor.core.publisher.Flux;
import java.util.ArrayList;
import java.util.Arrays;

public class ContraPresion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Flux<String> ciudades = Flux.fromIterable(
	                new ArrayList<>(Arrays.asList("New York", "London", "Paris", "Toronto", "Rome"))
	        );
	        ciudades.log().subscribe();

	}

}
