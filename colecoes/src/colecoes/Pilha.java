package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push("Duna");
		pilha.push("Pai rico e pai pobre");
		pilha.push("Maus");
		pilha.push("Crime e castigo");
		pilha.push("Quarto de despejo");		
		
		System.out.println(pilha);
		
		pilha.pop();
		System.out.println(pilha);
		
		System.out.println("O livro Guia dos Mochileiros das Galáxias está na pilha? " + pilha.contains("Guia dos Mochileiros das Galáxias"));
		
	}

}
