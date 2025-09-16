package lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) { 
		
		Scanner leia = new Scanner(System.in);
		
		//Declarar variavel para contar pares e impares
		
		int numero;
		int pares = 0;
		int impares = 0;
		
		// Laço para ler 10 números
		
		for(int contador= 1; contador <= 10; contador ++) {
			System.out.print("Digite o " + contador + "º número: ");
            numero = leia.nextInt();
            
        // Minha condição: par ou ímpar
            
            if(numero % 2 == 0) {
            	pares++;
            	
            }else {
            	impares++;
            }
		}
            	
        // Saída de dados
            	System.out.println("Quantidade de números pares: " + pares);
                System.out.println("Quantidade de números ímpares: " + impares);
                
            }
		}



