package colecoes;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		
		
		fila.add("Maria");
		fila.add("Aline");
		fila.add("Letícia");
		fila.add("Cintia");
		fila.add("Rayssa");
		
		//Retirar um elemento da Fila// retira sempre o 1º.
		fila.remove();
				
		System.out.println(fila);
		
		fila.add("Milena");
		fila.add("Nadia");
		
		System.out.println(fila);
		
		System.out.println("O tamanho da fila é:" + fila.size());
		
		//o var serve pra...
		for(var pessoa: fila) {
			System.out.println(pessoa);
	}
			
		
		
}

}
