package lacos_condicionais.condicionalIf;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//validar um número digitado pelo usuário
		//se for maior que 10, escrever "numerão" no console
		int numero;
		String nome;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número");
		numero = scanner.nextInt();
		//problema do scanner com o Scanner -> limpar a linha
		scanner.nextLine();
		
		System.out.println("Digite seu nome");
		nome = scanner.nextLine();
		
		//laço condicional
		//String comparar com equals -> Java não consegue tratar a string, por nãp ser um dado primitivo
		if (numero > 10 && nome.equals("Isabela")) {
			System.out.println("maior numerão");
		}
		
		System.out.println("obrigada");
	
	}

}
