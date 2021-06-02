import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;
public class Rook extends Piece {
	private ImageIcon image;			// The ImageIcon will be used to hold the Character's png.
	// This png must be saved in the images folder and will be loaded 
	// in the constructor.

	// method: Default constructor - see packed constructors comments for a description of parameters.
	public Rook(){
		this(1);
	}

	// method: Character's packed constructor
	// description: Initialize a new Character object.
	// parameters: int player - should be either 1 or 2. 1 for yellow team, 2 for black team.
	public Rook(int player){
		super(player);
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

	// method: isValidMove
	// description: This method checks to see if a move is valid.
	// Returns whether or not the attempted move is valid.
	// @param - Location from - the location that the piece will be moved from
	// @param - Location to - the location that the piece will be moved to
	// @param - Piece[][]b - the chess board.  a two dimensional array of pieces.
	// return - boolean - true if the move is valid 
	public boolean isValidMove(Location from, Location to, Piece[][]b){
		int startX = from.getColumn();
		int startY = from.getRow();
		int finishX = to.getColumn();
		int finishY = to.getRow();

		boolean returnStatement = true;	

		if( startX < finishX && finishY == startY) {
			for(int i =  startX+1; i < finishX-1; i++) {
				if (b[i][ finishY] != null) {
					returnStatement = false;
					System.out.println("1");
				}
			}
		} else if( startX > finishX && finishY == startY) {
			for(int i =  finishX-1; i > startX+1; i--) {
				if (b[i][ finishY] != null) {
					returnStatement = false;
					System.out.println("2");
				}
			}
		}


		if( startY < finishY && finishX == startX) {
			for(int i =  startY+1; i < finishY-1; i++) {
				if (b[  finishX][i] != null) {
					returnStatement = false;
					System.out.println("3");
				}
			}
		} else if( startY > finishY && finishX == startX) {
			for(int i =  finishY-1; i > startY-1; i--) {
				if (b[  finishX][i] != null) {
					returnStatement = false;
					System.out.println("4");
				}
			}
		}

		/*if(startX != finishX && startY != finishY) {
			returnStatement = false;
			System.out.println("5");
		}*/

		//if(b[  finishX][ finishY] != null) {
		//	if(b[  finishX][ finishY].getPlayer() ==b[ startX][ startY].getPlayer()){
		//		returnStatement = false;
		//	}}
		if(returnStatement) {
			returnStatement = validMove(  finishX,   finishY, b);
		}
		return returnStatement;
	}

	public String toString() {
		return "this is a rook";
	}


}