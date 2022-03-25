package com.br.collection;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootTest
public class CollectionApplicationTests {

	public static void main(String[] args){
		SpringApplication.run(CollectionApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2010;
		meuCarro.cor = "Azul";
		meuCarro.Fabricante = "Toyota";
		meuCarro.modelo = "Corolla Cross";

		Gson gson = new Gson();

		String json = gson.toJson(meuCarro);

		return json;

	}




}
