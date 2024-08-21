package guessTheNumberIGuess;
import java.util.Random;
import java.util.Scanner;
public class theonenumberthingimdoingrn {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner guh= new Scanner(System.in);
		//System.out.println("pick a number between 1-100 no decimals");
		Random random=new Random();
		int r=random.nextInt(101);
		int attempts=0;
		boolean won=false;
		//int a = guh.nextInt();
		while(!won) {
			System.out.println("give me nubmer ");
			int guess=guh.nextInt();
			attempts++;
			
		if(guess<1 || guess>100) {
			System.out.println("give me nubmer between 1-100 ");
			continue;
		}
		 if(guess<r) {
			System.out.println("low");
		}
		else if(guess>r) {
			System.out.println("high");
		}
		else {
			won=true;
			System.out.println("you did it i guess and it took you "+attempts+" attempts");
		}
		}
	}
}
