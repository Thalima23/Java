package lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada de Dados:
		
		System.out.println ("Digite o seu nome completo: ");
			String nome= leia.nextLine();
			
		System.out.println ("Digite sua idade: ");
			int idade= leia.nextInt();
			
		System.out.println("Primeira doação de sangue? (true/false) ");
	        boolean primeiraDoacao = leia.nextBoolean();	
		
	    // Regras
	        
	     if (idade< 18 || idade > 69) {

	    	 System.out.println(nome + " não está apto(a) para doar sangue!");
	     } else if (idade>=60 && idade <= 69 && primeiraDoacao) {
	    	 System.out.println(nome + " não está apto(a) para doar sangue!");
	     } else {	 
	    	 System.out.println(nome + " está apto(a) para doar sangue!");
		}
		
		leia.close();	
		
		}

	}
