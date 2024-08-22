package l3;

public class jnvisubbyio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 10;
        int x = 0;
        int y = 1;

        System.out.println(n);

        for (int i = 1; i <= n; ++i) {
            System.out.print(x + " ");

            int sum = x + y;
            x = y;
            y = sum;
        }
    }
}
