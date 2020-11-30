import java.util.Random;

public class Generatore {

	public static void main(String[] args) {
		double numeroCasuale = Math.random();
		//Viene stampato un numero double compreso tra 0 e 1 (estremi inclusi).
		System.out.println("Numero generato:" + numeroCasuale);

		double numeroCasualeMinore5 = Math.random()*5;
		//Viene stampato un numero double compreso tra 0 e 5.
		System.out.println("Numero generato:" + numeroCasualeMinore5);
		
		
		//Utilizzando un oggetto della classe Random
		Random random = new Random();
		
		//Generiamo un numero casuale intero compreso tra 0 e 9.
		int numero = random.nextInt(10);
		System.out.println(numero);
	}

}
