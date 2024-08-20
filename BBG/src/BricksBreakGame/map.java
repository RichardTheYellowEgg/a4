package BricksBreakGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class map {
	public int guh[][];
	public int brickHeight;
	public int brickWidth;
	public  map(int row, int col) {
		guh=new int [row][col];
		for(int i=0; i<guh.length; i++) {
			for(int j=0; j<guh.length; j++) {
				guh[i][j]=1;
			}
		}
		brickHeight=150/row;
		brickWidth=540/col;
	}
	public void draw (Graphics2D g) {
		for(int i=0; i<guh.length; i++) {
			for(int j=0; j<guh[0].length; j++) {
			if(guh [i][j]>0) {
				g.setColor(Color.white);
				g.fillRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
				g.setStroke(new BasicStroke(3));
				g.setColor(Color.black);
				g.fillRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
				}
			}
		}
	}
	public void setBrickValue(int value, int row, int colem) {
	guh[row][colem]=value;
}
}
