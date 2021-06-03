import java.awt.Component;
//Project Name: Queen
//Project Description: is a queen. basically an epic remix of rook and bishop
//Date: Jun 3, 2021
//Written By: Ari Steinfeld
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;
public class Queen extends Piece {
	private ImageIcon image;			// The ImageIcon will be used to hold the Character's png.
	// This png must be saved in the images folder and will be loaded 
	// in the constructor.

	// method: Default constructor - see packed constructors comments for a description of parameters.
	public Queen(){
		this(1);
	}

	// method: Character's packed constructor
	// description: Initialize a new Character object.
	// parameters: int player - should be either 1 or 2. 1 for yellow team, 2 for black team.
	public Queen(int player){
		super(player);
		if(player ==1) {
			setImageIcon("images2/queen1.png");
		}
		else {
			setImageIcon("images2/queen2.png");
		}
		this.setPlayer(player);			
	}

	// method: Character's packed constructor
	// description: Initialize a new Character object.
	// parameters: int player - should be either 1 or 2. 1 for yellow team, 2 for black team.
	public Queen(int player, String imagePath){
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
		double startX = from.getColumn();
		double startY = from.getRow();
		double finishX = to.getColumn();
		double finishY = to.getRow();

		boolean returnStatement = true;
		//checks for a self capture
		if((b[to.row][to.column] != null && b[to.row][to.column].getPlayer() == getPlayer())) {
			returnStatement =  false;

		}
		//checks if the movement is like a rook
		if(Math.abs(startY-finishY)!= Math.abs(startX-finishX)) {

			//if it is going down
			if( startX < finishX && finishY == startY) {
				for(int i = (int)startX+1; i < finishX-1; i++) {
					if (b[i][(int)finishY] != null) {
						returnStatement = false;

					}
				}

				//if it is going up
			} else if( startX > finishX && finishY == startY) {
				for(int i = (int)finishX-1; i > startX+1; i--) {
					if (b[i][(int)finishY] != null) {
						returnStatement = false;

					}
				}
			}

			//if it is going right
			if( startY < finishY && finishX == startX) {
				for(int i = (int)startY+1; i < finishY-1; i++) {
					if (b[(int) finishX][i] != null) {
						returnStatement = false;

					}
				}
			
			//if it is going left
			} else if( startY > finishY && finishX == startX) {
				for(int i = (int)finishY-1; i > startY-1; i--) {
					if (b[(int) finishX][i] != null) {
						returnStatement = false;

					}
				}
			}
			
			//if it is moving as it should
			if(startX != finishX && startY != finishY) {
				returnStatement = false;

			}
		
		//checks for bishop like movement
		}else {
			
			//repeats for how far it moved
			for(int i = 1; i < to.column - from.column; i++) {
				
				//checks down right
				if(to.row > from.row && to.column > from.column) {
					if(b[from.row + i][from.column + i] != null) 
						return false;
				}
				
				//checks down left
				else if(to.row > from.row && to.column < from.column) {
					if(b[from.row + i][from.column - i] != null) 
						return false;
				}
				
				//checks up right
				else if(to.row < from.row && to.column > from.column) {
					if(b[from.row - i][from.column + i] != null) 
						return false;
				}
				
				//checks up left
				else if(to.row < from.row && to.column < from.column) {
					if(b[from.row - i][from.column - i] != null) 
						return false;
				}

			}
		}

		//stops the classic queen suicide
		if(startX == finishX && startY == finishY) {
			returnStatement = false;

		}




		return returnStatement;
	}

	public String toString() {
		return "this is a queen, YASS";
	}


}
