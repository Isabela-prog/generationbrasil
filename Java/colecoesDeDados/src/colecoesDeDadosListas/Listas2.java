package colecoesDeDadosListas;

import java.util.ArrayList;
import java.util.Iterator;

public class Listas2 {
	public static void main(String[] args) {
		// saída usando iterator
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Jessica");
		nomes.add("Mina");
		nomes.add("Mayte");
		nomes.add("Gaby");
		nomes.add("Isa");
				
		Iterator<String> inome =  nomes.iterator();
		
		while(inome.hasNext()) {
			//.next -> ++
			System.out.println("Deva turma 80:" + inome.next());
		}
	}
}
