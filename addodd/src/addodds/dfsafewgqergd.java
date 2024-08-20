package addodds;
import java.util.Scanner;
public class dfsafewgqergd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("gimmie a number ");
		int z = sc.nextInt();
		for(int x=1; x<=z; x++) {
			if(x%2==0) {
				sum += x;
			}
		}
		System.out.println(sum);
	}

}
