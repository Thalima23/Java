package condicionais;

import java.util.Scanner;

public class Horoscopo {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int signo;
		
		System.out.println("===========================");
		System.out.println ("     Horóscopo do dia     ");
		System.out.println("===========================");
		System.out.println("      5- Capricórnio       ");
		System.out.println("      6-  Peixes           ");
		System.out.println("      1 - Áries            ");
		System.out.println("      2- Touro             ");
		System.out.println("      3-  Gêmeos           ");
		System.out.println("      4 - Câncer           ");
		System.out.println("===========================");
		System.out.println("Digite a opção desejada    ");
		
		 signo = leia.nextInt();
		
		switch(signo) {
		
		case 1: System.out.println("Áries: Hoje concentre-se em ações rápidas e ponderadas — priorize uma tarefa importante e avance com confiança.");
		break;
		case 2:System.out.println("Touro: Evite gastos impulsivos; organize suas finanças e desfrute pequenos prazeres com moderação.");
		break;
		case 3:System.out.println("Gêmeos: Comunique-se com clareza — uma conversa aberta pode esclarecer mal-entendidos e abrir oportunidades.");
		break;
		case 4:System.out.println("Câncer: Cuide do seu bem-estar emocional; reserve tempo para descansar e fortalecer vínculos familiares.");
		break;
		case 5:System.out.println("Capricórnio: Trabalhe com disciplina; metas realistas e passos consistentes trarão progresso visível.");
		break;
		case 6:System.out.println("Peixes: Confie na intuição, mas mantenha os pés no chão; atenção aos detalhes evitará confusões.");
		break;
		
		default:
		System.out.println("Opção Inválida");
		}
		
	
		leia.close();
	}
	
	

}
