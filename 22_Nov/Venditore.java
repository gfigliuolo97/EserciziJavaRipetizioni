/*
*Traccia
*Un venditore inserisce l'importo delle vendite di biscotti e taralli.
*Se vende più di 5.000€ di biscotti riceve una provvigione del 15%, altrimenti del 3%.
*Se vende più di 10.000€ di taralli riceve una provvigione del 16%, altrimenti del 5%.
*Se il totale delle vendite e' maggiore di 30.000€, riceve un premio extra del 12%.
*Stampare a video gli importi delle provvigioni, l'importo del totale delle provvigioni e dell'eventuale premio extra.
*/
import java.util.Scanner;
public class Venditore {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		double totale_provvigione = 0;
        double totale_venduto = 0;
        double provvigione_biscotti = 0;
		double provvigione_taralli = 0;
        double premio_extra = 0;

        //Biscotti
		System.out.println("Inserisci l'importo delle vendite dei biscotti:");
		double totale_biscotti = tastiera.nextDouble();
		
        //Taralli
        System.out.println("Inserisci l'importo delle vendite dei taralli:");
		double totale_taralli = tastiera.nextDouble();

		//Controlliamo e calcoliamo l'importo delle provvigioni
        if(totale_biscotti > 5000){
            provvigione_biscotti = (totale_biscotti * 15)/100;
        }else{
            provvigione_biscotti = (totale_biscotti * 3)/100;
        }
        
        System.out.println("Il totale delle provvigioni sui biscotti e':" + provvigione_biscotti + " euro.");
        
        //Controlliamo e calcoliamo l'importo delle provvigioni
        if(totale_taralli > 5000){
            provvigione_taralli = (totale_taralli * 16)/100;
        }else{
            provvigione_taralli = (totale_taralli * 5)/100;
        }

        System.out.println("Il totale delle provvigioni sui taralli e':" + provvigione_taralli + " euro.");
		
        //Calcoliamo la somma delle provvigioni
		totale_venduto = provvigione_biscotti + provvigione_taralli;
		
        //Controlliamo e calcoliamo l'importo del premio extra
        if(totale_venduto > 30000){
            premio_extra = (totale_provvigione * 12) / 100;
            totale_provvigione = totale_provvigione + premio_extra;
            System.out.println("Hai ricevuto un premio extra del valore di:" + premio_extra + " euro.");
        }

        System.out.println("Il totale delle provvigioni e del premio extra e':" + totale_provvigione + " euro.");

	}
}