package atn;
import java.util.Scanner;
public class huni8ogsfviuhjgf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d =0;
		double money=1;
		while(d!=4) {
		Scanner guh = new Scanner(System.in);
		System.out.println("your in debt do what do you want");
		System.out.println("press 1 for withdraw");
		System.out.println("press 2 for deposit");
		System.out.println("press 3 for how much money you have");
		System.out.println("press 4 to leave");
		d = guh.nextInt();
		switch(d) {
		case 1: 
			System.out.println("how much you want to withdraw");
			double e=guh.nextInt();
			if(e>0&& e<=money) {
				money-=e;
				System.out.println("$%.2f% withdraw success "+ e +"$");
			}
			else if(e>money) {
				System.out.println("you cant put that there");
			}
			else {
				System.out.println("lack of money");
			}
			break;
		case 2: 
			System.out.println("how much money you make to give me");
			double w=guh.nextInt();
			if(w>0) {
				money+=w;
				System.out.println("$%.2f% good job you put money in your account "+ w+"$");
			}
			else {
				System.out.println("wawa you cant do that here");
			}
			break;
		case 3:
			System.out.println("you have "+money+"$");
			break;
		case 4:
			System.out.println("you now leave the atm");
			default:
				System.out.println("stupid, read the top 5 lines, go to another atm and try again");
		}
	}
	}
}
