package brickJumpscare;

import javax.swing.JFrame;

public class MeWhenBrick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame obj = new JFrame();
		buh spin = new buh();
		obj.setBounds(10,10,700,600);
		obj.setTitle("bingus bricks");
		obj.setResizable(false); 
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(spin);
	}

}
