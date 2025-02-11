package exercicioEstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		// declarar variáveis
		int opcao;
		String nomes;
		boolean continuar = true;
		Queue<String> fila = new LinkedList<String>();
		
		// incializar scanner
		Scanner scanner = new Scanner(System.in);
		
		
		// menu irá rodar até que a variável continuar fique false
		while(continuar == true) {
			//construindo menu
			System.out.println("****************************");
			System.out.println("1 - Adicionar cliente a fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair");
			System.out.println("****************************");
			
			//pedir e capturar entrada usuário
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			if(fila.isEmpty() == true && (opcao == 2 || opcao == 3)) {
				System.out.println("não há ninguém na fila!");
			}else if(opcao == 1) {
				System.out.println("Entre com um nome: ");
				fila.add(nomes = scanner.nextLine());
			}else if(opcao == 2) {
				for(String nome: fila) {
					System.out.println(nome);
				}
			}else if(opcao == 3) {
				System.out.println(fila.poll());
			}else if(opcao == 0) {
				continuar = false;
			}else {
				System.out.println("Entre com um número válido");
			}
		}
		
	}
}
