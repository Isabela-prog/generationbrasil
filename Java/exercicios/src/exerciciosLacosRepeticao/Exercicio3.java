package exerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		//declarar variáveis
		int sum = 0, n;
		//iniciar scanner
		Scanner scanner = new Scanner(System.in);
		
		do {
			//pedir e capturar entrada
			System.out.println("digite um inteiro ou zero para sair: ");
			n = scanner.nextInt();
			
			//condição para apenas números positivos 
			if(n > 0) {
				//soma dos inteiros positvos
				sum += n;
				System.out.println("n: " + n);
				System.out.println("Sum: " + sum);
			}
		}while(n != 0);
		
		//saída
		System.out.println("A soma dos inteiros positivos é: " + sum);
	}
}
