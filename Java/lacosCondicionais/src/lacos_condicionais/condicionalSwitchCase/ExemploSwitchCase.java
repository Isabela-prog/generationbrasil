package lacos_condicionais.condicionalSwitchCase;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		// Criar um menu interativo, onde cada opção ofereça uma banda
		int opcao;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha um estilo musical");
		System.out.println("1 - Pagode");
		System.out.println("2 - Pop");
		System.out.println("3 - Rcok");
		System.out.println("4 - Clássica");
		
		opcao = scanner.nextInt();
		
		//performa melhor do if/else
		//exception -> olhar para tratar entradas diferentes
		switch(opcao) {
			case 1:
				System.out.println("Ouve um Molejão");
				break;
			case 2:
				System.out.println("Ouve um Backstreet Boys");
				break;
			case 3:
				System.out.println("Ouve um Metálica");
				break;
			case 4:
				System.out.println("Ouve um Bethoven");
				break;
			default:
				System.out.println("Digite um número válido");
		}

	}

}
