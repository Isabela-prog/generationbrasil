package vetores;

public class VetoresSimples {

	public static void main(String[] args) {
		//formas de declarar vetores
		
		int numeros[] = {8,9,10,11,12};
		float medidas[] = new float[5];
		
		System.out.println(numeros[1]);
		
		medidas[0] = 1.69f;
		
		String nomes[] = new String[10];
		String nomes2[] = {"Victoria", "Isabela", "Dani"};
		
		System.out.println("----------------");
		for(int i = 0; i < 3; i++){
			System.out.println("O nome no indice " + i + " é " + nomes2[i]);
		}

	}

}
