package examthingies;
import java.util.Scanner;
public class ExamScores {
	
	public static void main(String[] args) {
		Scanner yes= new Scanner(System.in);
		System.out.println("What score did you get on the exam?");
		int jimmy= yes.nextInt();
		
		if(jimmy >= 90) {
			System.out.println("Grade A");
		}
		else if(jimmy >= 80) {
			System.out.println("Grade B");
		}
		else if(jimmy >= 70) {
			System.out.println("Grade C");
		}
		else if(jimmy >= 60) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Grade F");
		}
	}

}
