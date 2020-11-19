/*
*Traccia
*Dati 2 numeri interi in input:
*-stampare il prodotto se sono entrambi pari
*-stampare la somma se almeno uno e' pari
*-stampare la divisione se sono entrambi dispari
*/
import java.util.Scanner;

public class PariDispari {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		boolean x_pari = false;
		boolean y_pari = false;
		int prodotto = 0;
		double divisione = 0;
		int somma = 0;
		
		System.out.println("Inserisci il primo numero:");
		int x = tastiera.nextInt();
		
		System.out.println("Inserisci il secondo numero:");
		int y = tastiera.nextInt();
		
		if(x % 2 == 0) {
			x_pari = true;
		}
		
		if(y % 2 == 0) {
			y_pari = true;
		}
		
		if(x_pari && y_pari){
			System.out.println("Tutti e due pari");
			prodotto = x * y;
			System.out.println("Il prodotto e':" + prodotto);
		}else if (x_pari || y_pari){
			System.out.println("Uno dei due e' pari");
			somma = x + y;
			System.out.println("La somma e':" + somma);
		}else {
			System.out.println("Nessuno dei due pari");
			divisione = x / y;
			System.out.println("La divisione e':" + divisione);
		}
				
	}
}
