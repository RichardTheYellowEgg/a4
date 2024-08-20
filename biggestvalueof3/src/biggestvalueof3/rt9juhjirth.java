package biggestvalueof3;
import java.util.Scanner;
public class rt9juhjirth {
	static void guh(int x,int y,int z) {
		int big;
		if(x>=y && x>=z) {
			big=x;
		}
		else if(y>=z && y>=x) {
			big=y;
		}
		else {
			big=z;
		}
		System.out.println(big);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner huh = new Scanner(System.in);
		System.out.println("first number");
		int x = huh.nextInt();
		System.out.println("second number");
		int y = huh.nextInt();
		System.out.println("third number");
		int z = huh.nextInt();
		guh(x,y,z);
	}

}

//arr= {1,2,3,4,5}, reverse the array
