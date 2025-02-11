package exerciciosColecaoDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//declarando variáveis
		ArrayList<String> cores = new ArrayList<String>();
		
		//inciar o scanner
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Entre com uma cor: ");
			cores.add(scanner.nextLine());
		}
		System.out.println("As cores digitadas foram: ");
		System.out.println(cores);
		
		System.out.println("As cores ordenadas são: ");
		cores.sort(null);
		System.out.println(cores);
	}

}
