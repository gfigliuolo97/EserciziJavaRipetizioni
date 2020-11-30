
public class Generatore {

	public static void main(String[] args) {
		double numeroCasuale = Math.random();
		
		//Viene stampato un numero double compreso tra 0 e 1 (estremi inclusi).
		System.out.println("Numero generato:" + numeroCasuale);

		double numeroCasualeMinore5 = Math.random()*5;
		//Viene stampato un numero double compreso tra 0 e 5 (estremi inclusi).
		System.out.println("Numero generato:" + numeroCasualeMinore5);
	}

}
