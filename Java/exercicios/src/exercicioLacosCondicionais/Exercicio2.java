package exercicioLacosCondicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Declarando variáveis
		int n1;
		
		// Criando Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Recebendo e capturando n1
		System.out.println("Entre com um inteiro:");
		n1 = scanner.nextInt();
		
		// Condicional -> verificar se par ou ímpar e negativo ou positivo
		
		if(n1 > 0 && (n1 % 2 == 0)) {
			System.out.println("O número é positivo e par");
		}else if(n1 > 0 && (n1 % 2 != 0)) {
			System.out.println("O número é positivo e ímpar");
		}else if(n1 < 0 && (n1 % 2 == 0) ) {
			System.out.println("O número é negativo e par");
		}else if(n1 < 0 && (n1 % 2 != 0) ) {
			System.out.println("O número é negativo e ímpar");
		}else {
			System.out.println("O número é nulo");
		}

	}

}
