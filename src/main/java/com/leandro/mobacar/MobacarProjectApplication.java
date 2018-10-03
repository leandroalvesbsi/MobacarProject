package com.leandro.mobacar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MobacarProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobacarProjectApplication.class, args);
	}
}
