import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;
public class Rook extends Piece {
	private ImageIcon image;			// The ImageIcon will be used to hold the Character's png.
	// This png must be saved in the images folder and will be loaded 
	// in the constructor.

	private int player;					// This int will represent which team the piece is, 1 for yellow team, 
	// 2 for black team. 

	// method: Default constructor - see packed constructors comments for a description of parameters.
	public Rook(){
		this(1);
	}
	public void draw(Graphics g, Component c, Location l) {
		image.paintIcon(c, g, l.column*90+45 , l.row*90+45 ); // you'll need to update the last two parameters so that it will 
		// correctly draw the piece in the right location.
	}

	// method: Character's packed constructor
	// description: Initialize a new Character object.
	// parameters: int player - should be either 1 or 2. 1 for yellow team, 2 for black team.
	public Rook(int player){
		if(player ==1) {
			setImageIcon("images2/rook1.png");
		}
		else {
			setImageIcon("images2/rook2.png");
		}
		this.setPlayer(player);			
	}

	// method: Character's packed constructor
	// description: Initialize a new Character object.
	// parameters: int player - should be either 1 or 2. 1 for yellow team, 2 for black team.
	public Rook(int player, String imagePath){
		setImageIcon(imagePath);
		this.setPlayer(player);			
	}

	protected void setImageIcon(String imagePath){
		ClassLoader cldr = this.getClass().getClassLoader();	

		URL imageURL = cldr.getResource(imagePath);				
		image = new ImageIcon(imageURL);
	}

	// method: isValidMove
	// description: This method checks to see if a move is valid.
	// Returns whether or not the attempted move is valid.
	// @param - Location from - the location that the piece will be moved from
	// @param - Location to - the location that the piece will be moved to
	// @param - Piece[][]b - the chess board.  a two dimensional array of pieces.
	// return - boolean - true if the move is valid 
	public boolean isValidMove(Location from, Location to, Piece[][]b){
		double startX = from.getColumn();
		double startY = from.getRow();
		double finishX = to.getColumn();
		double finishY = to.getRow();

		if( startX < finishX && finishY == startY) {
			for(int i = (int)startX+1; i < finishX-1; i++) {
				if (b[i][(int)finishY] != null) {
					return false;
				}
			}
		} else if( startX > finishX && finishY == startY) {
			for(int i = (int)finishX-1; i > startX+1; i--) {
				if (b[i][(int)finishY] != null) {
					return false;
				}
			}
		}


		if( startY < finishY && finishX == startX) {
			for(int i = (int)startY+1; i < finishY-1; i++) {
				if (b[(int) finishX][i] != null) {
					return false;
				}
			}
		} else if( startY > finishY && finishX == startX) {
			for(int i = (int)finishY-1; i > startY-1; i--) {
				if (b[(int) finishX][i] != null) {
					return false;
				}
			}
		}

		if(startX != finishX && startY != finishY) {
			return false;
		}

		if(b[(int) finishX][(int)finishY] != null) {
			if(b[(int) finishX][(int)finishY].getPlayer() == getPlayer()){
				return false;
			}}
		return true;
	}


}
