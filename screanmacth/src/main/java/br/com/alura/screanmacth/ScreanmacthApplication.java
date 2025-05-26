package br.com.alura.screanmacth;

import br.com.alura.screanmacth.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreanmacthApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreanmacthApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
