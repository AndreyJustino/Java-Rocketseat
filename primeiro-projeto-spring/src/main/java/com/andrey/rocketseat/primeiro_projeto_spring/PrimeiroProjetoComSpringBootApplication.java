package com.andrey.rocketseat.primeiro_projeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.andrey.rocketseat" ) //dizer aonde o spring vai caça o que rodar
@SpringBootApplication
public class PrimeiroProjetoComSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoComSpringBootApplication.class, args);
	}

}
