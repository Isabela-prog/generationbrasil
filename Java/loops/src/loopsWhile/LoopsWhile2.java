package loopsWhile;

import java.util.Scanner;

public class LoopsWhile2 {

	public static void main(String[] args) {
		// Quando o usuário decidi quantas vezes vai ser repetido
		
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		while(opcao != 9) {
			System.out.println("Digite qualquer número ou 9 para sair");
			opcao = scanner.nextInt();
			System.out.println("Opção digitada: " + opcao);
			System.out.println("==================");
		}
		
	}

}
