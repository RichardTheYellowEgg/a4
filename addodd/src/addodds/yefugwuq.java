package addodds;
import java.util.Scanner;
public class yefugwuq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("buh ");
		int z = sc.nextInt();
		for(int x=1; x<=z; x+=2) {//x++: x=x+1, x+=2 : x=x+2 2,4,6
			sum +=x;
			
			/*if(x%2==1) {
				sum += x;// sum=sum+x
			}
			*/
		}
		System.out.println(sum);
	}

}
