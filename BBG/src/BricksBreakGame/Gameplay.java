package BricksBreakGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.util.Timer;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
	
	
	private int score = 0;
	private boolean play = false;
	private int totalBricks = 21;
	private Timer timer;
	private int delay = 8;
	private int playerX = 300;// surface
	private int ballPosX = 120;
	private int ballPosY = 350;
	private int ballXDir = -1;
	private int ballYDir = -2;
	private map guh;
	
	public Gameplay () {
		guh = new map(3,7);
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay,this);
		timer.start();
		
	}
	
	//background
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(1,1,692,592);
		
	// drawing map
		guh.draw((Graphics2D )g);
		
	//boarder
		g.setColor(Color.pink);	
		g.fillRect(0,0,3,592);
		g.fillRect(0,0,692,3);
		g.fillRect(691,0,3,592);	

	//score
		g.setColor(Color.yellow);
		g.setFont(new Font("serif",Font.BOLD,25));
		g.drawString(""+score,590,30);;
	//paddle
		g.setColor(Color.green);
		g.fillRect(playerX, 550,100,8);
		
	//ball
		if(totalBricks<=0) {
			play=false;
			ballXDir=0;
			ballYDir=0;
			g.setColor(Color.red);
			g.setFont(new Font("serif",Font.BOLD,30));
			g.drawString("you lose i guess, score:  ",190,300);
			g.setFont(new Font("serif",Font.BOLD,20));
			g.drawString("press enter to return  ",230,350);
		}
		g.setColor(Color.white);
		g.fillOval(ballPosX, ballPosY, 20, 20);
		if(ballPosY>70) {
			play=false;
			ballXDir=0;
			ballYDir=0;
			g.setColor(Color.red);
			g.setFont(new Font("serif",Font.BOLD,30));
			g.drawString("you lose i guess, score:  ",190,300);
			g.setFont(new Font("serif",Font.BOLD,20));
			g.drawString("press enter to return  ",230,350);
		}
		
		
		g.dispose();
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		timer.start();
		if(play) {
			
			if (new Rectangle(ballPosX,ballPosY,20,20).intersects(new Rectangle(playerX,550, 100, 8))) {
				ballYDir =- ballYDir;
			}
			for(int i=0; i<guh.guh.length; i++) {
				for(int j=0; j <guh.guh[0].length; j++) {
					if(guh.guh[i][j]>0) {
						int brickX=j*guh.brickWidth+80;
						int brickY=i*guh.brickHeight+50;
						int brickWidth=guh.brickWidth;
						int brickHeight=guh.brickHeight;
						Rectangle rect = new Rectangle(brickX,brickY,brickWidth,brickHeight);
						Rectangle ballRect=new Rectangle(ballPosX,ballPosY, 20,20);
						Rectangle brickRect=rect;
						if(ballRect.intersects(brickRect)) {
							guh.setBrickValue(0,i,j);
							totalBricks--;
							score+=5;
						}
					}
				}
			}
			
			ballPosX+=ballXDir;
			ballPosY+=ballYDir;
			
			if (ballPosX<0) {
				ballXDir =- ballXDir;
			}
			if (ballPosY < 0) {
			ballYDir =- ballYDir;
			}
			
			if (ballPosX > 670) {
				ballXDir =- ballXDir;
			}
			
			
		} 
		repaint();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
		if(playerX <= 600) {
			playerX = 600;
			}
		else {
			moveRight();
		}
		}

	if(e.getKeyCode()==KeyEvent.VK_LEFT) {
		if(playerX <= 10) {
			playerX = 10;
		}
		else {
			moveLeft();
		}
	}
	if(e.getKeyCode()==KeyEvent.VK_ENTER) {
		if(!play) {
			play=true;
			ballPosX=120;
			ballPosY=350;
			ballXDir=-1;
			ballYDir=-2;
			playerX=310;
			score=0;
			totalBricks=21;
			guh=new map(3,7);
			repaint();
		}
	}
	}
	public void moveRight(){
		play = true;
		playerX+=20;
		
	}
		public void moveLeft(){
			play = true;
			playerX-=20;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	

}