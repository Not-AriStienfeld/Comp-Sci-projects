// ConnectFourPanel
// Written by: Mr. Swope 
// Modified by: Ari Steinfeld
// Date: May 18th, 2015
// Description: this is the jpanel code for connect 4
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ConnectFourPanel extends JPanel implements MouseListener{

	private int[][] board;  // two-dimensional array of characters.  

	private int turn;		 // will equal red or yellow to represent who's turn it is.

	private int whoWon;
	// method: PennyPinchPanel Constructor
	// description: This 'method' runs when a new instance of this class in instantiated.  It sets default values  
	// that are necessary to run this project.  
	public ConnectFourPanel(){
		setPreferredSize(new Dimension(448, 384));
		this.setFocusable(true);			// for mouselistener
		this.addMouseListener(this);
		board = new int[6][7];
		whoWon = 0;
		turn = -1;
	}

	// method: paintComponent
	// description: This method is called when the Panel is painted.  It contains 
	// code that draws shapes onto the panel.
	// parameters: Graphics g - this object is used to draw shapes onto the JPanel.
	// return: void
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;



		ImageIcon redImage;
		ImageIcon yellowImage;
		ImageIcon boardImage;
		// this code loads an image so that you can later paint it onto your component.

		ClassLoader cldr = this.getClass().getClassLoader();
		String imagePath = "images/red.png";
		URL imageURL = cldr.getResource(imagePath);
		redImage = new ImageIcon(imageURL);

		imagePath = "images/yellow.png";
		imageURL = cldr.getResource(imagePath);
		yellowImage = new ImageIcon(imageURL);

		imagePath = "images/board.png";
		imageURL = cldr.getResource(imagePath);
		boardImage = new ImageIcon(imageURL);
		boardImage.paintIcon(this, g, 0, 0);


		for(int row = 0; row < board.length; row++) 
			for(int column = 0; column < board[row].length; column++)
				if(board[row][column] == 1)
					redImage.paintIcon(this, g, (column*64), (row*64));
				else if(board[row][column] == -1)
					yellowImage.paintIcon(this, g, (column*64), (row*64));

		// Display a message if either red or yellow has won the game.

		if (whoWon == 1) {
			g2.setColor(Color.red);
			g2.drawString("RED WON", 100, 100);
		}if (whoWon == -1) {
			g2.setColor(Color.yellow);
			g2.drawString("YELLOW WON", 100, 100);
		}

	}

	// Check to see if red or yellow have won the game.
	public int checkWinner(){
		//left-leaning diagonals
		for (int i = 0; i < board.length-3; i++) {
			for (int j = 0; j < board[0].length-3; j++) {
				if (board[i][j] != 0 && board[i][j]== board[i+1][j+1] && board[i+1][j+1] == board[i+2][j+2] && board[i+2][j+2] == board[i+3][j+3]) {
					System.out.println("left");
					return turn;
				}

			}
		}
		//right-leaning
		for (int i = 0; i <board.length-3; i++) {
			for (int j = 3; j < board[0].length; j++) {
				if (board[i][j] != 0 && board[i][j]== board[i+1][j-1] && board[i+1][j-1] == board[i+2][j-2] && board[i+2][j-2] == board[i+3][j-3]) {
					System.out.println("right");
					return turn;
				}


			}

		}


		int counter = 0;	// Positive = red consec, negative = yellow consec



		// Check horizontal win

		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board[i].length; j++) {

				if (board[i][j] == 1) {

					if (counter >= 0)

						counter++;

					else

						counter = 1;

				}

				else if (board[i][j] == -1) {

					if (counter <= 0)

						counter--;

					else

						counter = -1;

				}



				if (counter == 4)

					return 1;

				else if (counter == -4)

					return -1;

			}

			counter = 0;

		}



		// Check vertical win

		for (int i = 0; i < board[0].length; i++) {

			for (int j = 0; j < board.length; j++) {

				if (board[j][i] == 1) {

					if (counter >= 0)

						counter++;

					else

						counter = 1;

				}

				else if (board[j][i] == -1) {

					if (counter <= 0)

						counter--;

					else

						counter = -1;

				}



				if (counter == 4)

					return 1;

				else if (counter == -4)

					return -1;

			}}

		counter = 0;


		return 0;
	}

	// this function will print the contents of board to the console.
	public void printBoard() {
		for(int i = 0; i < board.length; i++) {
			for (int j = 0; j > board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}
	}

	@Override
	// This method should detect which row and column the user clicked in, add their piece to the board,
	// switch who's turn it is and then repaint the board.  Also, you shouldn't allow anything to happen
	// if red or yellow has won.
	public void mouseClicked(MouseEvent e) {

		if(whoWon == 0) {
			int x = e.getX()/64;
			boolean condition = false;
			int counter = 5;
			while (condition == false) {
				if (board[counter][x] == 0) {
					board[counter][x] = turn;
					condition = true;
				}else if (counter == 0) {
					System.out.println("Full spot!");
					condition = true;
				}
				counter--;
			}

			whoWon=checkWinner();
			turn *=-1;

			// redraw the board

			this.repaint();
		}

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
