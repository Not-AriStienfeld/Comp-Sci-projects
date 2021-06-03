// Class: GraphicsPanel
// Written by: Mr. Swope
// Date: 12/2/15
// Description: This class is the main class for this project.  It extends the Jpanel class and will be drawn on
// 				on the JPanel in the GraphicsMain class.  
//
// Since you will modify this class you should add comments that describe when and how you modified the class.  
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;
import java.awt.Color;
import javax.swing.JPanel;

public class GraphicsPanel extends JPanel implements MouseListener{

	Piece p = new Piece();					// This piece should be deleted.  It is just here to later demonstrate how to paint on the board.


	private final int SQUARE_WIDTH = 90;    // The width of one space on the board.  Constant used for drawing board.
	private final int OFFSET = 30;
	private Location from;   			    // holds the coordinates of the square that the user would like to move from.
	private Location to;   				    // holds the coordinates of the square that the user would like to move to.
	private boolean click;// false until the game has started by somebody clicking on the board.  should also be set to false
	private int turn = -1;
	private int clickCount;
	private int startX;
	private int startY;
	// after an attempted move.
	private Piece[][] board; 				// an 8x8 board of 'Pieces'.  Each spot should be filled by one of the chess pieces or a 'space'. 

	public GraphicsPanel()
	{
		setPreferredSize(new Dimension(SQUARE_WIDTH*8+OFFSET+2,SQUARE_WIDTH*8+OFFSET+2));   // Set these dimensions to the width 
		board = new Piece[8][8];
		clickCount = 0;

		//start the board out in the right way
		board[0][0] = new Rook(-1);
		board[0][7] = new Rook(-1);
		board[0][3] = new King(-1);
		board[0][4] = new Queen(-1);
		board[7][0] = new Rook(1);
		board[7][7] = new Rook(1);
		board[7][3] = new King(1);
		board[7][4] = new Queen(1);
		for(int i = 2; i < 7; i++) {
			for(int j = 2; j< 7; j++) {
				board[i][j] = null;
			}
		}/*
		for(int i = 0; i < 8; i++) {
			   board[6][i] = new pawn(1);
		}
		for(int i = 0; i < 8; i++) {
			   board[1][i] = new pawn(-1);
		} */
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

		for(int i = 0; i <8; i+=2)
			for (int j = 0; j<8; j+=2)
			{
				g2.setColor(Color.gray);
				g2.fillRect(i*SQUARE_WIDTH+OFFSET,j*SQUARE_WIDTH+OFFSET,SQUARE_WIDTH,SQUARE_WIDTH);
			}

		for(int i = 1; i <8; i+=2)
			for (int j = 1; j<8; j+=2)
			{
				g2.setColor(Color.gray);
				g2.fillRect(i*SQUARE_WIDTH+OFFSET,j*SQUARE_WIDTH+OFFSET,SQUARE_WIDTH,SQUARE_WIDTH);
			}

		// instead of drawing a single piece you should loop through the two-dimensional array and draw each piece except for 
		// empty spaces.



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
		System.out.println("x = " + e.getX());
		System.out.println("y = " + e.getY());
		if (clickCount == 0) {
			startX = (int) (e.getX() -45)/90;
			startY = (int) (e.getY()-45)/90;
			clickCount = 1;
			System.out.println("selected " + startX + ", " + startY);
			if(board[startY][startX] != null){
				System.out.println(board[startY][startX].toString());
			}

		}else{

			System.out.println("clicked " + (e.getX() -45)/90 + ", " + (e.getY()-45)/90);
			clickCount  = 0;

			turn*= -1;
			if(board[startY][startX] != null && board[startY][startX].getPlayer() == turn) {
				if(board[startY][startX].isValidMove(new Location(startY, startX), new Location( (int) (e.getY()-45)/90, (int) (e.getX() -45)/90), board)) {
					if(!Objects.isNull(board[(int) (e.getY()-45)/90] [(int) (e.getX() -45)/90])&&board[(int) (e.getY()-45)/90] [(int) (e.getX() -45)/90].getWon() == 1) {
						for(int i = 0; i < 8; i++) {
							for(int j = 0; j < 8; j++) {
								board[i][j] = new King(-1);
							}
						}
					}else if(!Objects.isNull(board[(int) (e.getY()-45)/90] [(int) (e.getX() -45)/90])&&board[(int) (e.getY()-45)/90] [(int) (e.getX() -45)/90].getWon() == -1) {
						for(int i = 0; i < 8; i++) {
							for(int j = 0; j < 8; j++) {
								board[i][j] = new King(1);
							}
						}
					}else {
						board[(int) (e.getY()-45)/90] [(int) (e.getX() -45)/90]= board[startY][startX];
						board[startY][startX] = null;
					}
				}
			}
		}

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
	public void findKing() {

	}


}
