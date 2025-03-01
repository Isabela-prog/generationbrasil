package exerciciosVetoresEMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// declarar variáveis
		float notas[][] = new float[10][4];
		float medias[] = new float[10];	
		float sum = 0;
		
		//iniciar scanner
		Scanner scanner = new Scanner(System.in);
		
		//percorrer matriz para que o professor entre com as notas
		for(int l = 0; l < 10; l++) {
			sum =0f;
			for(int c = 0; c < 4; c++) {
				//perguntar e armazenar nota do aluno
				System.out.println("Entre com a nota " + (c+1) + " do aluno " + (l+1) + " :");
				notas[l][c] = scanner.nextInt();
				
				//tratar notas negativas
				if(notas[l][c] < 0) {
					System.out.println("Entre com um valor válido:");
					notas[l][c] = scanner.nextInt();
				}
				//fazer a soma da nota de um aluno nas 4 colunas
				sum += notas[l][c];
			}
			//adicionar ao vetor só fora do for da coluna, pois quando ele sai é porque temos um novo aluno (ou seja, nova linha)
			System.out.println("media do aluno " + (l+1) + ":");
			medias[l] = (sum/4);
			System.out.println(medias[l]);
		}
		//fazer um for para mostrar todas as medias juntas
		System.out.println("Todas as medias:");
		for(int i = 0; i < 10; i++) {
			System.out.println(medias[i]);
		}
	}

}
