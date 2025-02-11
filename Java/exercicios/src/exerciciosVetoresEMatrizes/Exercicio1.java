package exerciciosVetoresEMatrizes;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		int numero[] = {2,5,1,3,4,9,7,8,10,6};
		int numeroUsuario;
		boolean achei = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numeroUsuario = scanner.nextInt();
		
		//System.out.println(numeroUsuario);
		
		for(int i = 0; i < 10; i++) {
			if(numeroUsuario == numero[i]) {
				System.out.println("achei na posição " + (i+1));
				break;
			}else if(numeroUsuario != numero[i] && numero[i] == numero[9]){
				System.out.println("Não encontrei esse número");
				}
			}
		
		for(int i = 0; i < 10; i++) {
			if(numeroUsuario == numero[i]) {
				System.out.println("achei na posição " + (i+1));
				achei = true;
			}
		}
		if(achei == false) {
			System.out.println("não encontrei");
			}
		}
		

}
