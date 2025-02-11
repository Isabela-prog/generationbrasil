package exerciciosVetoresEMatrizes;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		// declarando variáveis
		int n[] = new int[10];
		int sum = 0;
		
		// inicializando scanner
		Scanner scanner = new Scanner(System.in);
		
		// pedindo e armazenando valor do usuário dentro do for
		//fazer a soma de todos elementos
		for(int i = 0; i < 10; i++) {
			System.out.println("Entre com um número: ");
			
			//tratar caso do usuário entrar com números negativos
			//colocar o numero digitado sempre no indice indicado por i
			n[i] = scanner.nextInt();
			sum += n[i];	
		}
		
		System.out.println("Os números pares são:");
		//trabalhar números pares do vetor
		//se o resto for zero, o número será par
		for(int i =0; i < 10; i++) {
			if(n[i] % 2 == 0) {
				System.out.println(n[i]);
			}
		}
		
		System.out.println("Os número ímpares são: ");
		//trabalhar os elementos ímpares
		//se o resto não for zero, o número é ímpar
		for(int i =0; i < 10; i++) {
			if(n[i] %2 != 0) {
				System.out.println(n[i]);
			}		
		}
		
		System.out.println("Soma dos números é:\n" + sum);
		System.out.println("Medias dos números é:\n" + sum/10);
	}

}
