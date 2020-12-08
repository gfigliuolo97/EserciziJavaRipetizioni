import java.util.Scanner;

public class CountChars {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert some text and then press ENTER:");
		String text = keyboard.nextLine();
				
		char[] textChars = text.toCharArray();
		
		System.out.println("Your text is " + textChars.length + " characters long.");	
		keyboard.close();
	}
}
