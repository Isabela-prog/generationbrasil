package loopsFor;

public class LoopsFor {

	public static void main(String[] args) {
		// para(inteiro contador = 0; contador < 10; contador++)
		
		
		// nesse caso o i será uma variável local, pra ser global é preciso declarar fora do for
		for(int i = 0; i < 10; i++) {
			System.out.println("O valor do contador é: " + i);
		}
		System.out.println();
	}

}
