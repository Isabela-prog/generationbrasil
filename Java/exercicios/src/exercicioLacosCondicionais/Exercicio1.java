package exercicioLacosCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Declarando variáveis
		int n1, n2, n3, sum;
		
		// Criando o Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Pedir entrada pro usuário e capturar
		System.out.println("Entre com o primeiro número: ");
		n1 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Entre com o segundo número: ");
		n2 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Entre com o terceiro número: ");
		n3 = scanner.nextInt();
		
		// Fazendo a soma de n1 e n2
		sum = n1 + n2;
		
		if(sum > n3) {
			System.out.println("A soma de A com B é maior do que C");
		} else if(sum == n3) {
			System.out.println("A soma de A com B é igual a C");
		} else {
			System.out.println("A soma de A com B é menor do que C");
		}

	}

}
