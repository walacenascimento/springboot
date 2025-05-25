package br.com.alura.contador.contador.model;

import java.util.Scanner;

public class Desafio1 {
    public void digitarNumero(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numero = leitura.nextInt();

        System.out.println("A sequencia do número digitado é:");
        for (int i = 1; i <= numero ; i++) {
            System.out.println(i);
        }
    }

}
