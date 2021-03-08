// ConnectFourMain.java
// Written by: Mr. Swope
// Modified by: Ari Steinfeld
// Date: February 10th, 2015
// This is the main class for a simple java program that uses graphics.  You do not need to edit this class.

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ConnectFourMain extends JFrame{
			
		public static void main(String[] args){	
			ConnectFourMain window = new ConnectFourMain();
	        JPanel p = new JPanel();
	        p.add(new ConnectFourPanel());  //  add a class that extends JPanel
	        window.setTitle("Penny Pinch");
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        window.setContentPane(p);
	        
	        window.pack();
	        window.setLocationRelativeTo(null);
	        window.setVisible(true);
		}

}
