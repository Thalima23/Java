package lista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) { 
		
		Scanner leia = new Scanner(System.in);
		
		//Declarar variavel para idade
		
		int idade;
		int menores21= 0;
		int maiores50= 0;
		
		System.out.print("Digite uma idade (ou número negativo para encerrar): ");
        idade = leia.nextInt();
        
        //Laço while, só roda enquanto a idade for positiva
        
        	while (idade >= 0) {
            
            if (idade < 21) {
                menores21++;
                	
            } else if (idade > 50) {
                maiores50++;
                
                // pede a próxima idade
                System.out.print("Digite uma idade (ou número negativo para encerrar): ");
                idade = leia.nextInt();
            }

            // saída 
            System.out.println("Total de pessoas com menos de 21 anos: " + menores21);
            System.out.println("Total de pessoas com mais de 50 anos: " + maiores50);

            leia.close();
            
            }

	}

}
