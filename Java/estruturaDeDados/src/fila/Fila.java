package fila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Jaque");
		fila.add("Eliane");
		fila.add("Sandra");
		
		System.out.println("Tamanho da fila: "+ fila.size());
		
		System.out.println("Próximo: " + fila.peek());
		
		System.out.println("Ultimo atendimento: " + fila.poll());
		
		System.out.println("Fila: " + fila);
		
		System.out.println("Ultimo atendimento: " + fila.poll());
		
		fila.add("Ana");
		fila.add("Gabi");
		fila.add("Mariana");
		fila.add("Willa");
		
		System.out.println(fila);
		
		Iterator<String> iterator = fila.iterator();
		
		//enquanto tiver o próximo continue
		while(iterator.hasNext()) {
			System.out.println("Próximo antedimento: " + iterator.next());
		}

	}

}
