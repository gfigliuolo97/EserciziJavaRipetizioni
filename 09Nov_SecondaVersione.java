import java.util.Scanner;

/*
Traccia:
Dati N numeri in input, stampare quanti sono dispari e con 4 cifre.
*/
class Esercizio09Novembre{
    boolean controlloPari(int numero){
        boolean numeroPari = false;
        
        if((numero % 2)  == 0){
            numeroPari = true;
        }
        return numeroPari;
    }
 
    public static void main(String[] args){

		Scanner tastiera = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi valutare?");
        int n = tastiera.nextInt();
        int contatore = 0;
        int i = 0;
        while(i < n){
            
            System.out.println("Inserisci il " + (i+1) + "° numero:");
            int numero = tastiera.nextInt();
            
            if(numero > 999 && controlloPari(numero)){
                contatore++;
            }
            i++;
        }
        System.out.println("I numeri dispari e con 4 cifre da te inseriti sono:" + contatore);
    }
}