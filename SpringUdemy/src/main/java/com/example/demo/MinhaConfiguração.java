package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@minhaAnotation
public class MinhaConfiguração {

	@Bean(name="minhaConfiguracao")
	public String minhaConfiguração() {
		return "Essa é minha configuração";
	}
	
	@Bean
	public CommandLineRunner executar() {
		return args -> {
			System.out.println("rodando desenvolvimento");
		};
		
	}
	
}
