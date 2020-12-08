import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert first number:");
		int x = keyboard.nextInt();
		
		System.out.println("Insert second number:");
		int y = keyboard.nextInt();
		
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
		
		int tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("Value of X after swap:"+x);
		System.out.println("Value of Y after swap:"+y);
		
		keyboard.close();
	}

}