import java.awt.*; 

import java.awt.event.*;

import java.awt.geom.*; 


import javax.swing.JFrame; 


import javax.swing.Timer;



public class main extends Canvas implements ActionListener, KeyListener{ 
	
	Timer tm = new Timer(5, this); 
	
	double x = 0, y = 0, xvel = 0, yvel = 0;
 
	
	
	public static void main(String[] args) { 
		
		main m = new main(); 
		
		JFrame f = new JFrame(); 
		
		f.add(m); 
		
		f.setSize(500, 500); 
		
		f.setVisible(true); 
	
	} 
	
	public void second(){ 
		
		tm.start(); 
		
		addKeyListener(this); 
		
		setFocusable(true); 
		
		setFocusTraversalKeysEnabled(false); 
	
	} 
	
	public void paint(Graphics g) { 
		
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("Breadfish.gif");
		g.drawImage(i, 120, 100, this);
	
	} 
	
	public void actionPerformed(ActionEvent e){ 
		
		repaint(); 
		
		x += xvel; 
		
		y += yvel; 
	
	} 
	
	public void w(){ 
		
		yvel = -1.5; 
		
		xvel = 0; 
	
	} 
	
	public void s(){ 
		
		yvel = 1.5; 
		
		xvel = 0; 
	
	} 
	
	public void a(){ 
		
		xvel = -1.5; 
		
		yvel = 0; 
	
	} 
	
	public void d(){ 
		
		xvel = 1.5; 
		
		yvel = 0; 
	
	} 
	
	public void keyPressed(KeyEvent e){ 
		
		int code = e.getKeyCode(); 

		
		if (code == KeyEvent.VK_W){ 
			
			w(); 
		
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
      
	}
      
	public void keyTyped(KeyEvent e) {}
      
	public void keyReleased(KeyEvent e) {}

}  