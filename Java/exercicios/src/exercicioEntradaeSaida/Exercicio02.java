package exercicioEntradaeSaida;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaração do nome e das notas
		String nome;
		float nota1, nota2, nota3, nota4, media;

		//Scanner para recebermos o valor da variável que o usuário irá digitar
		Scanner leia = new Scanner(System.in);
				
		//Recebendo o nome do usuário para gerar proximidade
		System.out.println("Olá, alune, digite seu nome a seguir: ");
		nome = leia.nextLine();
				
		//Recebendo notas
		System.out.println("Ok, " + nome + ", agora preciso saber suas notas. Vamos começar digitando a primeira: ");
		nota1 = leia.nextFloat();
				
		System.out.println("Ok. Agora preciso da segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("A sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Quase lá. Digite a sua quarta e última nota: ");
		nota4 = leia.nextFloat();
				
		//Calculando e exibindo media
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("Prontinho, " + nome + ". Sua media ficou em: " + media);
	}

}
