package com.fabio.soapws.validaformati.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.fabio.soapws.validaformati.config"})
public class ValidaFormatiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidaFormatiApplication.class, args);

	}

}
