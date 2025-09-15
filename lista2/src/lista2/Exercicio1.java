
	package lista2;

	import java.util.Scanner;

	public class Exercicio1 {

		public static void main(String[] args) {
			
	Scanner leia = new Scanner(System.in);
	
		//Declarando as variáveis
		float A, B, C, soma;
		
		System.out.println ("Digite o número A: ");
			A= leia.nextFloat();
		System.out.println ("Digite o número B: ");
			B= leia.nextFloat();
		System.out.println ("Digite o número C: ");
			C= leia.nextFloat();
			
			//calculando
			
			soma=(A+B);
			System.out.printf("O Resultado da soma é %.2f%n", soma);	
			if(soma> C) {
				System.out.println("A Soma de A+B é Maior que C");
}           else if (soma == C) {	
			System.out.println("A Soma de A+B é Igual a C");	
}           else {
				System.out.println("A Soma de A+B é menor que C");
}
	        
	        leia.close();    
	    }
	}

