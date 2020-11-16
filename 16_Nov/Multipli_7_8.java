import java.util.Scanner;
/*
 * Traccia:
 * Dati N numeri verificare quanti sono contemporaneamente multipli di 7 e 8.
 * Stampare se la media di questi numeri è pari o dispari.
 * */
public class Multipli_7_8 {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int i = 0;
		
		int numero = 0;
		int somma_multipli = 0;
		int contatore_numeri_multipli = 0;
		int n = 0;
		
		System.out.println("Insersci N:");
		n = tastiera.nextInt();
		
		do {
			System.out.println("Inserisci il prossimo numero:");
			numero = tastiera.nextInt();
			
			if(numero % 7 == 0) {
				if(numero % 8 == 0) {
					contatore_numeri_multipli = contatore_numeri_multipli + 1;
					somma_multipli = somma_multipli + numero;
				}
			}
			i = i + 1;
		}while(i < n);
		
		
		if((somma_multipli / contatore_numeri_multipli) % 2 == 0) {
			System.out.println("La media dei numeri multipli di 7 e 8 e' pari");
		}else {
			System.out.println("La media dei numeri multipli di 7 e 8 e' dispari");
		}
	}

}
