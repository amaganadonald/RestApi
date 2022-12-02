package com.gedpro.demo;

import java.sql.Timestamp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gedpro.demo.Entities.Departements;
import com.gedpro.demo.Services.DepartementService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner start(DepartementService departementService) {
		return  agrs -> {
			if (departementService.countDepart() == 0) {
				departementService.addDepartement(new Departements(null, "DTECH", "Departement Technique", new Timestamp(System.currentTimeMillis())));
				departementService.addDepartement(new Departements(null, "DCOM", "Departement Commerciale", new Timestamp(System.currentTimeMillis())));
				departementService.addDepartement(new Departements(null, "DINF", "Departement Informatique", new Timestamp(System.currentTimeMillis())));
			}
		};
	}
}
