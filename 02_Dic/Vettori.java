import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
        //Dichiarazione di un vettore di 10 elementi interi
		int[] vettore = new int[10];

        //Creazione di due variabili intere
		int a = 10;
		int b = 12;
		int c = 55;
		int d = 3;

        //Inserimento di valori in due elementi del vettore
        vettore[0] = a;
        vettore[1] = b;
        vettore[2] = c;
        vettore[3] = d;
		
        //Metodo 1 per visualizzare il vettore
		System.out.println(Arrays.toString(vettore));

        //Metodo 2 per visualizzare il vettore
        for(int elemento : vettore){
            System.out.print(elemento + ",");
        }
        //Nuova linea per una migliore visualizzazione in fase di output
        System.out.println();
        //Metodo 3 per visualizzare il vettore
        for(int i = 0; i<vettore.length; i++){
            System.out.print(vettore[i] + ",");
        }
	}

}
