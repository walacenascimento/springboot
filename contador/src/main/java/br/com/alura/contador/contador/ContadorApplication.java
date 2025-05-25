package br.com.alura.contador.contador;

import br.com.alura.contador.contador.model.Avaliacao;
import br.com.alura.contador.contador.model.Tarefa;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Desafio 1
//		var desafio1 = new Desafio1();
//		desafio1.digitarNumero();

		// Desafio 2
		//Tarefa tarefa = new Tarefa( "Estudar a noite", true, "Eu");
		//tarefa.tarefa("dever de casa", true, "Eu");

		// Serializando dados

		ObjectMapper objectMapper = new ObjectMapper();

		// Gravando o dados no arquivo em um formando json
//		objectMapper.writeValue(new File("tarefa.json"), tarefa);
//		System.out.println("Dados salvos no arquivo tarefa.json!");

		// Desserializando dados:
		// Lendo dados do arquivo Json
//		Tarefa tarefaLida = objectMapper.readValue(new File("tarefa.json"), Tarefa.class);
//		System.out.println("Tarefa lida do JSON:");
//		System.out.println(tarefaLida);

		// chamando a classe genérica
		Avaliacao avaliacao = new Avaliacao<>("Filme", 10, "Muito Bom");
		System.out.println(avaliacao);

	}
}
