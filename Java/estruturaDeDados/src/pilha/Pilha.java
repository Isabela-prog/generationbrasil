package pilha;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Naila");
		pilha.push("Carol");
		pilha.push("Daniel");
		
		System.out.println(pilha);
		
		//System.out.println(pilha.pop());
		//System.out.println(pilha);
		//System.out.println(pilha.contains("Naila"));
		
		for(String nome: pilha) {
			System.out.println("O nome " + nome + " está na pilha");
		}
	}

}
