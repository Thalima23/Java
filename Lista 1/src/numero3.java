import java.util.Scanner;

public class numero3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//Declarar variáveis
		float salário, adicional, extras, descontos, media; //salário líquido;
		
		//Declarar variáveis
		System.out.print("salário: ");
        salário = leia.nextFloat();
        
        System.out.print(" adicional: ");
        adicional= leia.nextFloat();
        
        System.out.print("extras: ");
        extras= leia.nextFloat();
        
        System.out.print("descontos: ");
        descontos= leia.nextFloat();
        
        //cálculo das médias
        
        media= (salário +adicional+(extras*5)-descontos);
        
        //Saída com duas casas decimais
		
        System.out.printf("Salário Líquido: %.2f%n", media);
        
        leia.close();
        
	}
}
