package exercicioEntradaeSaida;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declarando as variáveis
		float n1, n2, n3, n4, diferencaProdutos;
		
		//Scanner para poder receber variáveis digitadas pelo usuário
		Scanner leia = new Scanner(System.in);
		
		//Pedir para o usuário os valores
		//guardar valores nas variáveis
		System.out.println("Olá. Para saber a diferença do produto de dois números pelo produto entre outros dois, preciso que digite quatro valores. Digite o primeiro:");
		n1 = leia.nextFloat();
		
		System.out.println("Ok. Agora preciso do segundo: ");
		n2 = leia.nextFloat();

		System.out.println("Agora digite o terceiro: ");
		n3 = leia.nextFloat();

		System.out.println("O último: ");
		n4 = leia.nextFloat();
		
		//calculando a diferença entre os produtos
		//exibir resultado
		diferencaProdutos = (n1 * n2) - (n3 * n4);
		System.out.println("Prontinho. A diferença entre os produtos ficou: " + diferencaProdutos);
		
	}

}
