package loopsWhileDo;

import java.util.Scanner;

public class LoopsWhileDo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = 9;
		
		do {
			System.out.println("Digite 9 para sair ou qlqr número pra continuar");
			i = scanner.nextInt();
			System.out.println("você digitou: " + i);
		}while(i != 9);
		System.out.println("saíu");
	}

}
