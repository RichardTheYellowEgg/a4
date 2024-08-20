package arraydupes;

public class oljihdohdo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x= {3,4,2,3,6,4,2};
		for(int i=0; i<x.length; i++) {
			for(int j=i+1; j<x.length; j++) {
				if((x[i]==x[j])&&(i!=j)){
					System.out.println(x[i]);
				}
			}
		}
	}

}
