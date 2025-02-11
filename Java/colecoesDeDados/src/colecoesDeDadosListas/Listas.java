package colecoesDeDadosListas;

import java.util.ArrayList;
import java.util.Comparator;

public class Listas {

	public static void main(String[] args) {
		// Uma lista de dados LIST
		ArrayList<String> nomes = new ArrayList<String>();
		//nomes[0] = "Mayte"; modo errado de adicionar nomes na lista				nomes.add("Mayte");
		nomes.add("Jessica");
		nomes.add("Mina");
				
		//todos os nomes
		System.out.println(nomes);
				
		//retornar apenas 1 nome
		System.out.println(nomes.get(2));
				
		//System.out.println(nomes.get(5));
				
		//retornamos o indice com o indexOf
		//podemos ver a posição adicionando mais 1 ao indice
		System.out.println(nomes.indexOf("Jessica")+1);
				
		//retorna -1 para quando não acha o nome na lista
		//System.out.println(nomes.indexOf("Mariana"));
		
		//atualizar um dado da lista
		nomes.set(2,"Mina Monteiro");
				
		System.out.println(nomes);
		//nomes.set(3,"Mina Monteiro");
				
		//adicionar item na lista indicando a posição
		nomes.add(1,"Gabrielly");
		System.out.println(nomes);
				
		nomes.add("Jessica");		
		System.out.println(nomes);
				
		//remover um item da lista
		nomes.remove(2);
		System.out.println(nomes);
				
		System.out.println(nomes.get(2));
				
		System.out.println(nomes.isEmpty());
		
		System.out.println(nomes.contains("Jessica"));
		
		nomes.sort(Comparator.reverseOrder());
		System.out.println(nomes);
		
		nomes.remove(nomes.indexOf("Mayte"));
		nomes.remove("Mayte");
		
		
	}
		 
}