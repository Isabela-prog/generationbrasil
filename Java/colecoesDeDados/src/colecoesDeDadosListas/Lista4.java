package colecoesDeDadosListas;

import java.util.HashSet;
import java.util.Set;

public class Lista4 {
	public static void main(String[] args) {
		//adicionando sem ordem, processamento mais rápido
		//elementos não tem índice
		//cada elemento tem uma hash(um código) e por isso ele sabe onde está
		//se tiverem dados iguais ele não repete
		Set<String> nomes = new HashSet<String>();
		
		nomes.add("Gaby");
		nomes.add("Jessica");
		nomes.add("Mina");
		nomes.add("Mayte");
		nomes.add("Isa");
		
		System.out.println(nomes.contains("Mina"));
		
		//percorrer o set usando forEach
		for(String n: nomes) {
			System.out.println("O nome é: " + n);
		}
	}
}
