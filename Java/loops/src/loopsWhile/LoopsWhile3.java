package loopsWhile;

import java.util.Scanner;

public class LoopsWhile3 {
	public static void main(String[] args) {
		
		String opcao = "";
		Scanner scanner = new Scanner(System.in);
		
		while(!opcao.equals("sair")) {
			System.out.println("digite sair para sair");
			opcao = scanner.nextLine();
			System.out.println("dentro do while");
		}
		
	}
}
