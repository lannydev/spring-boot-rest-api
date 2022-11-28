package com.lannydev.docespersonalizados;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(
		basePackages = {"com.lannydev.docespersonalizados.repository", "com.lannydev.docespersonalizados.service"}
		)
//como é um array, pode ser colocado quantos pacotes desejar
@RestController
public class DocesPersonalizadosApplication {

	@Value("${application.name}")
	private String applicationName;

	@GetMapping("/hello")
	public String helloWorld(){
		return applicationName;
	}

	public static void main(String[] args) {
		SpringApplication.run(DocesPersonalizadosApplication.class, args);
	}

}
