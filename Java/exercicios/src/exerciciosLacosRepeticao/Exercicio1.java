package exerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Declarando variáveis
		int n1, n2, i, intervalo;
		
		// Iniciando o scanner
		Scanner scanner = new Scanner(System.in);
		
		// Pedindo e capturando entradas
		System.out.println("Digite o primeiro número do intervalo: ");
		n1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Digite o último número do intervalo: ");
		n2 = scanner.nextInt();
		
		// Tratando entrada em que o n2 for menor que o n1 ou as duas entradas forem iguais
		if(n1 > n2 || n1 == n2) {
			System.out.println("O primeiro número deve ser menor do que o último, digite novamente");
			System.out.println("Digite o primeiro número do intervalo: ");
			n1 = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Digite o último número do intervalo: ");
			n2 = scanner.nextInt();		
		}
		
		// variável para controlar o númeor de repetições no loop, já que ele precisa repetir a quantidade de números que existe dentro do intervalo
		intervalo = n2 - n1;
		
		// inciando o loop
		for(i = 0; i < intervalo; i++) {
			//condição para verificar se o é divisível por 3 e 5
			if((n1 % 3 == 0) && (n1 % 5 == 0)) {
				System.out.println(n1 + " é múltiplo de 3 e 5");
				//soma 1 no n1 para que pegue o próximo número
				n1++;							
			}else {
				n1++;
			}

		}
		
	}

}
