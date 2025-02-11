package colecoesDeDadosListas;

import java.util.ArrayList;

public class Listas3 {
	public static void main(String[] args) {
		// saída usando foreach
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Jessica");
		nomes.add("Mina");
		nomes.add("Mayte");
		nomes.add("Gaby");
		nomes.add("Isa");
		
		//objeto -> tudo que é estanciado dentro de uma classe -> criado a partir de uma classe
		//foreach
		//passa na lista e toda vez que acha um elemento coloca dentro de n
		//ele cria uma variável temporária para cada item da lista
		//linguagem funcional
		for(String n: nomes) {
			System.out.println(n);
		}
	}
}
