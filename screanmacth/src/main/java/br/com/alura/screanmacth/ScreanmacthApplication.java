package br.com.alura.screanmacth;

import br.com.alura.screanmacth.model.DadosEpisodio;
import br.com.alura.screanmacth.model.DadosSerie;
import br.com.alura.screanmacth.service.ConsumoAPI;
import br.com.alura.screanmacth.service.ConverteDados;
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
		var consumoAPI = new ConsumoAPI();

		var json =  consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

		json = consumoAPI.obterDados("https://omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=6585022c");
		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
		System.out.println(dadosEpisodio);



		// API de imagem café
//		json = consumoAPI.obterDados("https://coffee.alexflipnote.dev/random.json");
//		System.out.println(json);

	}
}
