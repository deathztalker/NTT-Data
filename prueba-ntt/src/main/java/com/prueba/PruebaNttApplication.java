package com.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PruebaNttApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaNttApplication.class, args);
	}

}
