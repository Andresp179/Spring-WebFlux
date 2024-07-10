package com.example.WebFlux;
import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;


public class Ejemplin {
	
	@Test
	public void testTransMap() {
		
		List<String> listaNombres= Arrays.asList("google","abc","fb","stacjoverfloow");
		Flux<String> nombresFlux= Flux.fromIterable(listaNombres)
				                 .filter(nombre -> nombre.length()>5)
				                 .map(nombre->nombre.toUpperCase())
				                 .log();
		
		 StepVerifier.create(nombresFlux)
         .expectNext("GOOGLE","STACKOVERFLOW")
         .verifyComplete();
	}
	
	  @Test
	    public void testTransformUsingFlatMap(){
	        List<String> listaNombres = Arrays.asList("google","abc","fb","stackoverflow");
	        Flux<String> nombresFlux = Flux.fromIterable(listaNombres)
	                .filter(nombre -> nombre.length() > 5)
	                .flatMap(nombre -> {
	                    return Mono.just(nombre.toUpperCase());
	                })
	                .log();

	        StepVerifier.create(nombresFlux)
	                .expectNext("GOOGLE","STACKOVERFLOW")
	                .verifyComplete();
	    }

}
