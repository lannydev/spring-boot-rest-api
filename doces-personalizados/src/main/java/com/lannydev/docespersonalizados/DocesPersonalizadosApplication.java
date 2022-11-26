package com.lannydev.docespersonalizados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DocesPersonalizadosApplication {
	@GetMapping("/hello")
	public String helloWorld(){
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DocesPersonalizadosApplication.class, args);
	}

}
