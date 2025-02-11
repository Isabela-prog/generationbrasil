package exerciciosColecaoDeDados;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio2 {
	public static void main(String[] args) {
		// declarando variáveis
		int numero;
		Set<Integer> numeros = new HashSet<Integer>();
		
		// incializando scanner
		Scanner scanner = new Scanner(System.in);
		
		// for começando em 0 e indo até menor que 10 para o usuário digitar 10 números
		for(int i = 0; i < 10; i++) {
			// pedir e capturar o número
			System.out.println("Digite um valor: ");
			numero = scanner.nextInt();
			
			// verificando se o usuário já digitou o número antes através do contains
			while(numeros.contains(numero)) {
				System.out.println("Digite um valor que não tenha sido digitado: ");
				numero = scanner.nextInt();
			}
			// adicionar o valor do usuário ao conjunto
			numeros.add(numero);
		}
		
		System.out.println("Números: ");
		//usar o iterator para mostrar todos os números no while
		Iterator<Integer> iterator = numeros.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
