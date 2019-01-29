package useful;
import java.util.Scanner;

public class Utilities {

	static Scanner input = new Scanner(System.in);
	
	public static void cleanScreen() {
		for (int i = 0; i < 50; ++i) {
		    System.out.println ();
		}
	}
	
	public static void pauseBeforeMenu() {
		
		System.out.println("\nPress any key to return to the menu");
		input.nextLine();
		
	}
	
	
}
