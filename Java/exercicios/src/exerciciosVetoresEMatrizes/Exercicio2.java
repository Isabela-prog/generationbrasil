package exerciciosVetoresEMatrizes;

public class Exercicio2 {

	public static void main(String[] args) {
		int matriz[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sumPrincipal = 0;
		int sumSecundaria = 0;
		
		System.out.println("Diagonal principal: ");
		for(int l = 0; l < 3; l++) {
			//System.out.println(l + "-" + l);
			System.out.println(matriz[l][l]);
			sumPrincipal += matriz[l][l];
		}
		System.out.println("Soma diagonal principal = " + sumPrincipal);
		System.out.println("==========================");
		System.out.println("Diagonal secundária: ");
		for(int l = 0; l < 3; l++) {
			System.out.println(matriz[l][2-l]);
			sumSecundaria += matriz[l][2-l];
		}
		System.out.println("Soma diagonal secundária = " + sumSecundaria);

	}

}
