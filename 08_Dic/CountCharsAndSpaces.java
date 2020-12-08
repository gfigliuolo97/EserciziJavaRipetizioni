import java.util.Scanner;

public class CountCharsAndSpaces {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert some text and then press ENTER:");
		String text = keyboard.nextLine();
				
		char[] textChars = text.toCharArray();
		
		int i = 0;
		int digitsCounter = 0;
		int spacesCounter = 0;
		int letterCounter = 0;
		
		while(i<textChars.length) {
			
			if(Character.isDigit(textChars[i])){
				digitsCounter++;
			}else if(Character.isSpaceChar(textChars[i])) {
				spacesCounter++;
			}else if(Character.isLetter(textChars[i])){
				letterCounter++;
			}
			i++;
		}
		
		System.out.println("Your text has:\n"+spacesCounter+" spaces\n"+digitsCounter+" digits and "+letterCounter+" letters.");
		
		keyboard.close();
	}
}
