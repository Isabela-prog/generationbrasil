package exercicioEntradaeSaida;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaração das variáveis
		String nome;
		float salarioBruto, adicionalNoturno, horaExtra, descontos, salarioLiquido;

		//Scanner para recebermos o valor da variável que o usuário irá digitar
		Scanner leia = new Scanner(System.in);
		
		//Recebendo o nome do usuário para gerar proximidade
		System.out.println("Olá, para começarmos, que tal me dizer seu nome: ");
		nome = leia.nextLine();
		
		//Recebendo o salário
		System.out.println("Ok, " + nome + ", vamos lá. Me diga qual é o seu salário: ");
		salarioBruto = leia.nextFloat();
		
		//Recebendo o hora extra
		System.out.println("Entendi. Agora preciso saber quanto você recebeu de horas extras: ");
		horaExtra = leia.nextFloat();
		
		//Recebendo o adicional noturno
		System.out.println("O valor do seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		//Recebendo o desconto
		System.out.println("E agora, o valor do seu desconto: ");
		descontos = leia.nextFloat();
		
		//Calculando salári líquido
		//Exibindo
		salarioLiquido = salarioBruto + adicionalNoturno + (horaExtra*5) - descontos;
		System.out.println("Pronto, " + nome + ". Seu salário líquido é: " + salarioLiquido);
	}

}
