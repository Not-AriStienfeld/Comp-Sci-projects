// Tic-Tac-Toe Panel
// Written by: Mr. Swope
// Date: May 18th, 2015
// This project extends the Jpanel class. In order to draw items on this panel you need use the Graphics2D's methods.
// Update these comments by writing when, who and how you modified this class.
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TicTacToePanel extends JPanel implements MouseListener{

	private int[][] board;  // two-dimensional array of integers.  When a player clicks on a square
	// you'll add a -1 for x or a +1 for o to the corresponding location in this array.

	private int turn;		 // will equal x or o to represent who's turn it is.


	// method: TicTacToePanel Constructor
	// description: This 'method' runs when a new instance of this class in instantiated.  It sets default values  
	// that are necessary to run this project.  
	public TicTacToePanel(){
		setPreferredSize(new Dimension(300, 300));
		this.setFocusable(true);			// for mouselistener
		this.addMouseListener(this);
		

		board = new int[3][3];
		turn = -1;
	}

	// method: paintComponent
	// description: This method is called when the Panel is painted.  It contains 
	// code that draws shapes onto the panel.
	// parameters: Graphics g - this object is used to draw shapes onto the JPanel.
	// return: void
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(Color.GRAY);
		g2.fillRect(0, 0, 300, 300);
		g2.setColor(Color.BLUE); 

		ImageIcon xImage;
		ImageIcon oImage;
		// this code loads an image so that you can later paint it onto your component.
		// this would load a picture named x.png that should be saved in a folder
		// named images, which should be located in your src folder.
		// these images were downloaded from imageicon.com.  you can download other 
		// images from this website to use instead of these.
		ClassLoader cldr = this.getClass().getClassLoader();
		String imagePath = "images/x.png";
		URL imageURL = cldr.getResource(imagePath);
		xImage = new ImageIcon(imageURL);

		imagePath = "images/o.png";
		imageURL = cldr.getResource(imagePath);
		oImage = new ImageIcon(imageURL);
		// draw the grid for the tic-tac-toe board.  you should make each square about 100x100.
		g2.fillRect(100, 0, 2, 300);
		g2.fillRect(200, 0, 2, 300);
		g2.fillRect(0, 100, 300, 2);
		g2.fillRect(0, 200, 300, 2);

		// this is how you paint your image. the last two parameters are the x and y coordinates 
		// of the top left hand corner of the image.
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[j][i] == -1) {
					xImage.paintIcon(this, g, j * 100, i * 100);
				} else if (board[j][i] == 1) {
					oImage.paintIcon(this, g, j * 100, i * 100);
				}
			}
		}
		// Display a message if either x or o has won the game.

	}

	// Check to see if x or o have won the game.
	public boolean checkWinner(){
		
		//check for horizontal win
		for (int row = 0; row < board.length; row++) {
			if(board[row][0] != 0 && board[row][0] == board[row][1] && board[row][2] == board[row][1])//check to see if they are all the same and now zerp
				return true;
		}
		
		//check for verticle win
		for (int colum = 0; colum < board.length; colum++) {
			if(board[0][colum] != 0 && board[0][colum] == board[1][colum] && board[2][colum] == board[1][colum])//check to see if they are all the same and now zerp
				return true;
		}
		
		//check for diagonal win
		if(board[0][0] != 0 && board[1][1] == board[0][0] && board[1][1] == board[2][2]) 
			return true;
		if(board[0][2] != 0 && board[1][1] == board[0][2] && board[1][1] == board[2][0]) 
			return true;
		

		
		
		
		
		return false;
	}

	//this will print the contents of board to the console
	public void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[j][i] == -1) {
					System.out.print("x ");
				} else if (board[j][i] == 0) {
					System.out.print("- ");
				}else {
					System.out.print("o ");
				}
			}
			System.out.println("");
		}
		
	}
	@Override
	// This method should detect which row and column the user clicked in, add their piece to the board,
	// switch who's turn it is and then repaint the board.  Also, you shouldn't allow anything to happen
	// if x or o has won.
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouse clicked x-value = " + e.getX() + " y-value = " + e.getY());
		
		//calculate row and column index based on x and y
		//can be done with simple math operation 
		int x = e.getX()/100;
		int y = e.getY()/100;
		if (board[x][y] == 0) {
			board[x][y] = turn;
		}
		turn *= -1;
		//printboard
		printBoard();
		this.repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
