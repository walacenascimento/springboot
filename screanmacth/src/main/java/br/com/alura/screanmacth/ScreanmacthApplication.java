package br.com.alura.screanmacth;

import br.com.alura.screanmacth.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.comments.CommentLine;

@SpringBootApplication
public class ScreanmacthApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreanmacthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoAPI consumoAPI = new ConsumoAPI();
		var json =  consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);

		// API de imagem café
		json = consumoAPI.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);

	}
}
