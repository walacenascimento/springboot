package br.com.alura.contador.contador;

import br.com.alura.contador.contador.model.Desafio1;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Desafio 1
		var desafio1 = new Desafio1();
		desafio1.digitarNumero();

//		Scanner leitura = new Scanner(System.in);
//		System.out.println("Digite um número: ");
//
//		int numero = leitura.nextInt();
//
//		for (int i = 1; i <= numero ; i++) {
//			System.out.println(i);
//		}
	}
}
