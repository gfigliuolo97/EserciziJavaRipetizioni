import java.util.Scanner;

/*
 * Traccia:
 * Dato un numero, stabilire se e' perfetto o no.
 * Un numero si dice perfetto se e' uguale alla somma dei suoi divisori. 
 * Esempio: Il numero 6 e' divisibile per 1,2,3. La somma 1+2+3 = 6.
 * Quindi 6 e' un numero perfetto.
 * */
public class MainNumeroPerfetto {
	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci il numero?");
        int numero = tastiera.nextInt();			//Prendo in input da tastiera il numero e lo memorizzo nella variabile 'numero'
        
		int div = 2;
		int somma = 1;
		
		while(div <= (numero / 2)) {			//Fin quando il divisore è minore o uguale alla meta' del numero inserito
			if(numero % div == 0) {				//Controllo se div è un divisore di numero
				somma = somma + div;			//In caso affermativo, lo aggiungo alla variabile somma che contiene la somma dei divisori del numero
			}
			div = div + 1;						//Incremento il divisore per la prossima iterazione
		}
		if(somma == numero) {
			System.out.println("Il numero che hai inserito e' perfetto");
		}else {
			System.out.println("Il numero che hai inserito non e' perfetto");
		}
	}		
}
