package arithmaticOperatorsoros;
import java.util.Scanner;
public class nijusdniujfisjoyippie {
	
	public static void main(String[] args) {
		//= equal
		//!= not equal
		//+ addition
		//- subtraction
		// / division
		//* multiplication
		//% remainder (modulues)
		//int x = 11 % 3;
		//System.out.println(x);
		Scanner yes= new Scanner(System.in);
		System.out.println("Put the number of a day 1-7");
		int day= yes.nextInt();
		
		switch(day) {  // if
		case 1: 
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednsday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
			
			
			default:
				System.out.println("Day does not exist");
		}
	}

}
/* Switch (expression/condition)
.. case x:
	statement
	break

  ..default */