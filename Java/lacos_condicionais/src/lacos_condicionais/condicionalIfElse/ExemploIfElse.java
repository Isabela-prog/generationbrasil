package lacos_condicionais.condicionalIfElse;

public class ExemploIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//validar a media de um aluno
		//maior que 6 -> aprovado
		//caso nota esteja entre 5 e 6 -> exame
		//senão => reprovado
		
		float media = 7f;
		
		if(media > 6) {
			System.out.println("Aprovado");
		}else if(media > 5) {
			System.out.println("Exame");
		}else {
			System.out.println("Reprovado");
		}
	}

}
