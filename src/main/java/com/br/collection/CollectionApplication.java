package com.br.collection;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@SpringBootApplication
public class CollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2010;
		meuCarro.cor = "Azul";
		meuCarro.Fabricante = "Toyota";
		meuCarro.modelo = "Corolla Cross";

		Usuario usuario = new Usuario();

		usuario.email = "teste123@gmail.com";
		usuario.nome = "Lucas Tester";


		Endereco endereco = new Endereco();
		endereco.cep = "123456789";
		endereco.endereco = "numero 400, casa 4";
		endereco.rua = "Antonio Bandeira";

		usuario.endereco = endereco;

		meuCarro.usuario = usuario;

		Gson gson = new Gson();

		String json = gson.toJson(meuCarro);

		return json;

	}

	@RequestMapping("/preco")
	String preco() {

		try {
			Preco preco=null;

			ArrayList<Preco> arr = new ArrayList<>();

			StringBuilder sb = new StringBuilder();

			preco = getPreco(preco, arr, sb);
			Gson gson = new Gson();

			String json = gson.toJson(arr);
			if (1 == 2-1 ) {
				throw new NegocioException("Teste erro" + preco.tipoProduto);
			}
			return json;

		}catch (Exception ex){
			return ex.getMessage();
		}

	}

	private Preco getPreco(Preco preco, ArrayList<Preco> arr, StringBuilder sb) {
		for(int i = 1; i <= 5; i++) {
			preco = new Preco();
			preco.valorCustos = 140 + i;
			preco.definirTipoProduto(TipoProduto.FISICO);
			Produto produto = new Produto();
			produto.definirPreco(preco, 20, 15);

			arr.add(preco);
			sb.append(preco.tipoProduto);
		}
		return preco;
	}

}
