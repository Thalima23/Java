package helloworld;

import java.util.Scanner;
public class Variaveis {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner (System.in);
		
    int peso = 50;
    char opcao = 'S';
    float valor = 100.00f;
    System.out.println("Digite o peso");
    int peso2 = leia.nextInt();
    char opcao2 = leia.next().charAt(0);
    float valor2 = leia.nextFloat();
    
    System.out.println("O valor da variável peso é:" + peso);
    System.out.println("O valor da variável peso é:" + opcao);
    System.out.println("O valor da variável peso é:" + valor);
    System.out.printf("O valor da variável peso é %.2f", valor);
	}
	

}
