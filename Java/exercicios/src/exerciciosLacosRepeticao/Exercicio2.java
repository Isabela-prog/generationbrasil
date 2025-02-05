package exerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int idade, escape = 1, contador1 = 0, contador2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(escape != 0) {
			//entrar com a idade
			System.out.println("Entre com uma idade: ");
			idade = scanner.nextInt();
			scanner.nextLine();
				
			//tratar idade negativa
			if(idade < 0) {
				System.out.println("Digite uma idade válida: ");
				idade = scanner.nextInt();		
			}
			
			//fazer o contador
			if(idade < 21) {
				contador1++;
			}else if(idade > 50) {
				contador2++;
			}
			
			//pedir o escape depois para tratar o caso de a pessoa digitar uma criança menor de um ano
			System.out.println("Digite 0 para sair ou qualquer número para digitar mais idades: ");
			escape = scanner.nextInt();
			
			if(escape == 0) {
				System.out.println("Total de pessoas menores de 21 anos: " + contador1);
				System.out.println("Total de pessoas maiores de 50 anos: " + contador2);
			}
			
				
			
		}
		
	}
}
