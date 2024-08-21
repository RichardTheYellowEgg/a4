package inputFullnamer;
import java.util.Scanner;

public class NamerFunction {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("First Name: ");
		String First = sc.nextLine();
		System.out.println("Last Name: ");
		String Last = sc.nextLine();
		//String sum = First+Last;
		System.out.println("Your name is " + First + " " + Last);
		
	}


}

