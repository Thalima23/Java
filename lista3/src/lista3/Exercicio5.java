package lista3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		  Scanner leia = new Scanner(System.in);
		  int numero;
	        int somaPositivos = 0;

	        do {
	            // Entrada de dados
	            System.out.print("Digite um número inteiro (0 para encerrar): ");
	            numero = leia.nextInt();

	            // Condição: só somar se o número for positivo
	            if (numero > 0) {
	                somaPositivos += numero; 
	            }

	        } while (numero != 0); // repete enquanto não for zero

	        // Saída de dados
	        System.out.println("A soma dos números positivos digitados é: " + somaPositivos);

	        leia.close();
		  
		  
	}

}
