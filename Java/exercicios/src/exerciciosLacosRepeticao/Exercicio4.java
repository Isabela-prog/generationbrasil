package exerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// declarando variáveis
		int n1, preco = 0, quantia, total;
		String pedido = null;
		
		// criando o scanner
		Scanner scanner = new Scanner(System.in);
		
		// montando menu
		System.out.println("1 - Cachorro quente");
		System.out.println("2 - X-Salada");
		System.out.println("3 - X-Bacon");
		System.out.println("4 - Bauru");
		System.out.println("5 - Refrigerante");
		System.out.println("6 - Suco de laranja");
		
		// pedidndo e capturando entrada do menu
		System.out.println("Digite o número do item que você deseja comprar: ");
		n1 = scanner.nextInt();
		scanner.nextLine();
		
		// pedidndo e capturando qauntia de itens
		System.out.println("Digite o número da quantidade desse produto: ");
		quantia = scanner.nextInt();
		scanner.nextLine();
		
		// Criando switch que receberá os preços
		switch(n1){
			case 1:
				pedido = "Cachorro quente";
				preco = 10;
				break;
			case 2:
				pedido = "X-salada";
				preco = 15;
				break;
			case 3:
				pedido = "X-bacon";
				preco = 18;
				break;
			case 4:
				pedido = "Bauru";
				preco = 12;
				break;
			case 5:
				pedido = "Refrigerante";
				preco = 8;
				break;
			case 6:
				pedido = "Suco de laranja";
				preco = 13;
				break;
			default:
				System.out.println("Entre com uma opção válida de pedido. Obrigada");
				break;
		}
		
		// tratar entrada que for 0 na quantia
		// o (n1 > 0 && n1 < 7 ) foi colocado para que mesmo digitando um número inválido no n1, ele não entre na condicional se tiver digitado uma quantida válida
		if(quantia != 0 && (n1 > 0 && n1 < 7 )) {
			total = preco * quantia;
			System.out.println("Prontinho! Seu pedido foi de " + quantia + " x " + pedido + ". \nO valor ficou em: " + total);
		}else if(quantia == 0 && (n1 > 0 && n1 < 7 )) {
			total = preco;
			System.out.println("Prontinho! Seu pedido foi um " + pedido + ". \nO valor ficou em: " + total);
		}

	}

}
