package bricksBreakGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
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
	
	public Gameplay () {
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
		
	//boarder
		g.setColor(Color.pink);	
		g.fillRect(0,0,3,592);
		g.fillRect(0,0,692,3);
		g.fillRect(691,0,3,592);	

	//paddle
		g.setColor(Color.green);
		g.fillRect(playerX, 550,100,8);
		
	//ball
		g.setColor(Color.white);
		g.fillOval(ballPosX, ballPosY, 20, 20);
		
		
		
		g.dispose();
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		timer.start();
		if(play) {
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
	}
	
	
	
	
	addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_RIGHT) {
                playerX -= 10;
            }

            if (key == KeyEvent.VK_LEFT) {
                squareX += 10;
            }

            repaint();
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
