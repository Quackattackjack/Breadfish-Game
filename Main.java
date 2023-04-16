import java.awt.*; 

import java.awt.event.*;

import java.awt.geom.*; 


import javax.swing.JFrame; 


import javax.swing.Timer;



public class Main extends Canvas implements ActionListener, KeyListener{ 
	
	Timer tm = new Timer(5, this); 
	
	double x = 0, y = 0, xvel = 0, yvel = 0, movementSpeed = 3;

	KeyInput input;
 
	
	
	public static void main(String[] args) { 
		
		new Main(); 
	
	} 

	public Main(){
		
		JFrame f = new JFrame(); 
		
		f.add(this); 
		
		f.setSize(500, 500); 
		
		f.setVisible(true); 

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//input = new KeyInput();
		this.addKeyListener(this);

		this.requestFocus();

	}
	
	public void second(){ 
		System.out.println("second method is alive yo");
		tm.start(); 
		
		//addKeyListener(this); 
		
		setFocusable(true); 
		
		setFocusTraversalKeysEnabled(false); 
	
	} 

	//public void run(){

	//}
	
	public void paint(Graphics g) { 
		
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("Breadfish.gif");
		g.drawImage(i, (int)x, (int)y, this);
	
	} 

	
	public void actionPerformed(ActionEvent e){ 
		System.out.println("Action performd!!!");
		x += xvel; 
		
		y += yvel; 

		repaint(); 
	
	} 
	
	public void w(){ 

		yvel = -movementSpeed; 
		
		xvel = 0; 
	
	} 
	
	public void s(){ 
		
		yvel = movementSpeed; 
		
		xvel = 0; 
	
	} 
	
	public void a(){ 
		
		xvel = -movementSpeed; 
		
		yvel = 0; 
	
	} 
	
	public void d(){ 
		
		xvel = movementSpeed; 
		
		yvel = 0; 
	
	} 
	
	public void keyPressed(KeyEvent e){ 
		System.out.println("keyPwessed b impwessed");
		int code = e.getKeyCode(); 

		
		if (code == KeyEvent.VK_W){ 
			
			w(); 
			System.out.println("W!");
		
		} 
		
		if (code == KeyEvent.VK_S){ 
			
			s(); 
		
		} 
            		
		if (code == KeyEvent.VK_D){
	  		
			d();
            		
		}
            		
		if (code == KeyEvent.VK_A){
	  		
			a();
            		
		}

		x += xvel; 
		
		y += yvel; 

		repaint(); 
      
	}
      
	public void keyTyped(KeyEvent e) {}
      
	public void keyReleased(KeyEvent e) {}

}  