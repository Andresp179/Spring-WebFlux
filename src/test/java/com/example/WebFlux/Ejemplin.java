package com.example.WebFlux;
import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;


public class Ejemplin {

	
	@Test
	public void testTransMap() {
		
		List<String> listaNombres= Arrays.asList("google","abc","fb","stacjoverfloow");
		Flux<String> nombresFlux= Flux.fromIterable(listaNombres)
				                 .filter(nombre -> nombre.length()>5)
				                 .map(nombre->nombre.toUpperCase())
				                 .log();
	}
}
