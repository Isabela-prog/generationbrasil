package exercicioEstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {
	public static void main(String[] args) {
		int opcao;
		String livros;
		boolean continuar = true;
		Stack<String> pilha = new Stack<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		while(continuar == true) {
			System.out.println("****************************");
			System.out.println("1 - Adicionar libro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar liro da pilha");
			System.out.println("0 - Sair");
			System.out.println("****************************");
			
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			if(pilha.isEmpty() == true && (opcao == 2 || opcao == 3)) {
				System.out.println("não há ninguém na pilha!");
			}else if(opcao == 1) {
				System.out.println("Entre com o livro: ");
				pilha.push(livros = scanner.nextLine());
			}else if(opcao == 2) {
				for(String nome: pilha) {
					System.out.println(nome);
				}
			}else if(opcao == 3) {
				System.out.println(pilha.pop());
			}else if(opcao == 0) {
				continuar = false;
			}else {
				System.out.println("Entre com um número válido");
			}
		}
	}
}
