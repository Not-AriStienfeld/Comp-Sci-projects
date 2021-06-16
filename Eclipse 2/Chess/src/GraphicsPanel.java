//Project Name: Chess
//Project Description: allows you to play a chess game with highlighted moves, pawn upgrading, and win conditions
//Date: Jun 10, 2021
//Written By: Ari Steinfeld
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;
import java.awt.Color;
import javax.swing.JPanel;
import java.util.Scanner;



public class GraphicsPanel extends JPanel implements MouseListener{

	Piece p = new Piece();					// This piece should be deleted.  It is just here to later demonstrate how to paint on the board.


	private final int SQUARE_WIDTH = 90;    // The width of one space on the board.  Constant used for drawing board.
	private final int OFFSET = 30;
	private Location from;   			    // holds the coordinates of the square that the user would like to move from.
	private Location to;   				    // holds the coordinates of the square that the user would like to move to.
	private boolean click;// false until the game has started by somebody clicking on the board.  should also be set to false
	private int turn = -1; //-1 is white, 1 is black
	private int clickCount; //is used to figure out if you have selected a piece
	private int startX; //first x value
	private int startY; //first y value
	private boolean gameOver; //if true then the game ends. not much more to say here.
	private Piece[][] board; 	// an 8x8 board of 'Pieces'.  Each spot should be filled by one of the chess pieces or a 'space'. 
	private Scanner s = new Scanner(System.in);
	public GraphicsPanel()
	{
		setPreferredSize(new Dimension(SQUARE_WIDTH*8+OFFSET+2,SQUARE_WIDTH*8+OFFSET+2));   // Set these dimensions to the width 
		board = new Piece[8][8];
		clickCount = 0;
		gameOver = false;

		//start the board out in the right way
		board[0][0] = new Rook(-1);
		board[0][7] = new Rook(-1);
		board[0][1] = new Knight(-1);
		board[0][6] = new Knight(-1);
		board[0][5] = new Bishop(-1);
		board[0][2] = new Bishop(-1);
		board[0][4] = new King(-1);
		board[0][3] = new Queen(-1);
		board[7][0] = new Rook(1);
		board[7][7] = new Rook(1);
		board[7][1] = new Knight(1);
		board[7][6] = new Knight(1);
		board[7][5] = new Bishop(1);
		board[7][2] = new Bishop(1);
		board[7][4] = new King(1);
		board[7][3] = new Queen(1);
		for(int i = 2; i < 7; i++) {
			for(int j = 2; j< 7; j++) {
				board[i][j] = null;
			}
		}

		for(int i = 0; i < 8; i++) {
			board[6][i] = new pawn(1);
		}
		for(int i = 0; i < 8; i++) {
			board[1][i] = new pawn(-1);
		} 
		this.setFocusable(true);					 // for keylistener
		this.addMouseListener(this);

		// instantiate the instance variables.
	}

	// method: paintComponent
	// description: This method will paint the items onto the graphics panel.  This method is called when the panel is
	//   			first rendered.  It can also be called by this.repaint()
	// parameters: Graphics g - This object is used to draw your images onto the graphics panel.
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		// Draw the board
		g2.setColor(Color.gray);
		g2.drawLine(SQUARE_WIDTH*8+OFFSET, OFFSET, SQUARE_WIDTH*8+OFFSET, SQUARE_WIDTH*8+OFFSET);
		g2.drawLine(OFFSET, SQUARE_WIDTH*8+OFFSET, SQUARE_WIDTH*8+OFFSET, SQUARE_WIDTH*8+OFFSET);
		g2.drawLine(OFFSET, OFFSET, SQUARE_WIDTH*8+OFFSET, 0+OFFSET);
		g2.drawLine(OFFSET, OFFSET, OFFSET, SQUARE_WIDTH*8+OFFSET);

		for(int i = 1; i <8; i+=2)
			for (int j = 1; j<8; j+=2)
			{
				g2.setColor(Color.gray);
				g2.fillRect(i*SQUARE_WIDTH+OFFSET,j*SQUARE_WIDTH+OFFSET,SQUARE_WIDTH,SQUARE_WIDTH);
			}

		for(int i = 0; i <8; i+=2)
			for (int j = 0; j<8; j+=2)
			{
				g2.setColor(Color.gray);
				g2.fillRect(i*SQUARE_WIDTH+OFFSET,j*SQUARE_WIDTH+OFFSET,SQUARE_WIDTH,SQUARE_WIDTH);
			}

		// instead of drawing a single piece you should loop through the two-dimensional array and draw each piece except for 
		// empty spaces.

		//reveals all possible moves by using isValidMove
		if(clickCount == 1 && board[startY][startX] != null) {
			for(int i = 0; i < 8;i++) {
				for(int j = 0; j < 8; j++) {
					if(board[startY][startX].isValidMove(new Location(startY, startX), new Location( j, i) , board)) {
						g2.setColor(Color.yellow);
						g2.fillRect(i*90 + 30, j*90 + 30, 90, 90);

					}
				}
			}
		}

		//repaints the pieces
		for(int i = 0; i < 8;i++) {
			for(int j = 0; j < 8; j++) {
				if(board[i][j] != null) {
					board[i][j].draw(g2, this, new Location(i, j));
				}
			}
		}


	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// use math to figure out the row and column that was clicked.
		//System.out.println("x = " + e.getX());
		//System.out.println("y = " + e.getY());

		//checks for win condition
		if(!gameOver) {

			//selecting a piece
			if (clickCount == 0) {
				startX = (int) (e.getX() -30)/90;
				startY = (int) (e.getY()-30)/90;
				clickCount = 1;
				System.out.println("selected " + startX + ", " + startY);
				if(board[startY][startX] != null){
					System.out.println("SELECTED "+board[startY][startX].toString());

				}


				//choosing where you want to go
			}else{

				System.out.println("clicked " + (e.getX() -30)/90 + ", " + (e.getY()-30)/90);
				clickCount  = 0;
				turn*= -1;

				//checks if the move is valid
				if(board[startY][startX] != null && board[startY][startX].getPlayer() == turn) {
					if(board[startY][startX].isValidMove(new Location(startY, startX), new Location( (int) (e.getY()-30)/90, (int) (e.getX() -30)/90), board)) {

						//if the move IS valid, then this will check to see if a king is getting taken
						if(!Objects.isNull(board[(int) (e.getY()-30)/90] [(int) (e.getX() -30)/90])&&board[(int) (e.getY()-30)/90] [(int) (e.getX() -30)/90].getWon() == 1) {
							for(int i = 0; i < 8; i++) {
								for(int j = 0; j < 8; j++) {
									board[i][j] = new King(-1);

								}
							}
							gameOver = true;
							System.out.println("BLACK WINS");
						}else if(!Objects.isNull(board[(int) (e.getY()-30)/90] [(int) (e.getX() -30)/90])&&board[(int) (e.getY()-30)/90] [(int) (e.getX() -30)/90].getWon() == -1) {
							for(int i = 0; i < 8; i++) {
								for(int j = 0; j < 8; j++) {
									board[i][j] = new King(1);

								}
							}
							gameOver = true;									
							System.out.println("WHITE WINS");
						}else {
							//if the move is valid but the piece isn't a king, then normalness ensues. 
							board[(int) (e.getY()-30)/90] [(int) (e.getX() -30)/90]= board[startY][startX];
							board[startY][startX] = null;
						} //hu
					}
				}
				if(turn == -1) {
					System.out.println("WHITE TURN");
				}else {
					System.out.println("BLACK TURN");
				}
			}
			//upgrades any pawn that was brave enough to cross the entire board
			upgrades();
		}

		this.repaint();
	}


	//upgrades pawn based on user input because someone might want an extra knight.
	public void upgrades() {

		//basic loop
		for(int i = 0; i <= 7; i++) {

			//checks to see if there is a pawn on the black end of the board
			if(board[0][i] != null && board[0][i].toString().equals("pawn")) {

				//gets user input
				System.out.println("what peice do you want to upgrade to?");
				System.out.println("at 0, " + i);
				String type = s.next();

				//makes it so that capitalization doesn't matter
				type = type.toLowerCase();

				//swaps based on what user said
				if (type.equals("queen")) {
					board[0][i] = new Queen(board[0][i].getPlayer());
				}
				if (type.equals("rook")) {
					board[0][i] = new Rook(board[0][i].getPlayer());
				}
				if (type.equals("bishop")) {
					board[0][i] = new Bishop(board[0][i].getPlayer());
				}
				if (type.equals("knight")) {
					board[0][i] = new Knight(board[0][i].getPlayer());
				}

			}
			//checks to see if there is a pawn on the white end of the board
			if(board[7][i] != null && board[7][i].toString().equals("pawn")) {

				//gets user input
				System.out.println("what peice do you want to upgrade to?");
				System.out.println("at 7, " + i);
				String type = s.next();

				//makes it so that capitalization doesn't matter
				type = type.toLowerCase();

				//swaps based on what user said
				if (type.equals("queen")) {
					board[7][i] = new Queen(board[7][i].getPlayer());
				}
				if (type.equals("rook")) {
					board[7][i] = new Rook(board[7][i].getPlayer());
				}
				if (type.equals("bishop")) {
					board[7][i] = new Bishop(board[7][i].getPlayer());
				}
				if (type.equals("knight")) {
				board[7][i] = new Knight(board[7][i].getPlayer());
			}
		}

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
public void findKing() {

}


}
