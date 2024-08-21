package conditional1;
import java.util.Scanner;
public class conditionally {
	
	public static void main(String[] args) {
		// if the age is grater than 18 then it will show a message "You are allowed to entry, otherwise it will show"you are too young
		Scanner buh= new Scanner(System.in);
		System.out.println("Age");
		int age = buh.nextInt();
		
		if(age >= 18) {
			System.out.println("You are allowed to enter");
		}
		
		else
			System.out.println("You are too young");
		
	}
	//order of if statments
	//if 
	//else if
	//else if
	//else
		// exam score, if the score is greater then 90, grade A, Greater then 80 then Grade B if grater then 70 show Grade C, 60 D, 50 F
}
