package exercicioEntradaeSaida;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaração das variáveis
		String nome;
		float salario, abono, novoSalario;

		//Scanner para recebermos o valor da variável que o usuário irá digitar
		Scanner leia = new Scanner(System.in);
		
		//Recebendo o nome do usuário para gerar proximidade
		System.out.println("Olá, para começarmos, que tal me dizer seu nome: ");
		nome = leia.nextLine();
		
		//Recebendo o salário
		System.out.println("Ok, " + nome + ", vamos lá. Me diga qual é o seu salário: ");
		salario = leia.nextFloat();
		
		//Recebendo o abono
		System.out.println("Entendi. Agora para poder te dizer qual seu novo salário, preciso saber de quanto foi o seu abono: ");
		abono = leia.nextFloat();
		
		//Calculando e exibindo novo salário
		novoSalario = salario + abono;
		System.out.println("Prontinho, " + nome + ". Seu novo salário ficou no valor de: " + novoSalario);
	}

}
