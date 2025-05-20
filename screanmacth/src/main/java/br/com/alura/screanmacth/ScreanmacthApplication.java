package br.com.alura.screanmacth;

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
		System.out.println("Iniciando os estudos de Java com SpringBoot");
	}
}
