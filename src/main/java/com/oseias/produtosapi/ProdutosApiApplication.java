package com.oseias.produtosapi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProdutosApiApplication {

    @GetMapping("/inicial")
    public String mostrar(){
        return "26/01/2025 - CHECK!";
    }

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApiApplication.class, args);
	}



}
