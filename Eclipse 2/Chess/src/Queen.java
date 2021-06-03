import java.awt.Component;
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
		//works, I'm an idiot
		if((b[to.row][to.column] != null && b[to.row][to.column].getPlayer() == getPlayer())) {
			returnStatement =  false;
			System.out.println("JOE");
		}
		
		if(Math.abs(startY-finishY)!= Math.abs(startX-finishX)) {
			if( startX < finishX && finishY == startY) {
				for(int i = (int)startX+1; i < finishX-1; i++) {
					if (b[i][(int)finishY] != null) {
						returnStatement = false;
						System.out.println("1");
					}
				}
			} else if( startX > finishX && finishY == startY) {
				for(int i = (int)finishX-1; i > startX+1; i--) {
					if (b[i][(int)finishY] != null) {
						returnStatement = false;
						System.out.println("2");
					}
				}
			}


			if( startY < finishY && finishX == startX) {
				for(int i = (int)startY+1; i < finishY-1; i++) {
					if (b[(int) finishX][i] != null) {
						returnStatement = false;
						System.out.println("3");
					}
				}
			} else if( startY > finishY && finishX == startX) {
				for(int i = (int)finishY-1; i > startY-1; i--) {
					if (b[(int) finishX][i] != null) {
						returnStatement = false;
						System.out.println("4");
					}
				}
			}
			if(startX != finishX && startY != finishY) {
				returnStatement = false;
				System.out.println("5");
			}

		}else {
			if(finishX-startX>0 && finishY - startY > 0) {
				for(int i = (int) (startX+1); i < finishX-1; i++) {
					if(b[(int)startX + i][(int)startY+i] != null) {
						returnStatement = false;
						System.out.println("7");
					}
				}
			}else if(finishX-startX<0 && finishY - startY < 0) {
				for(int i = (int) (startX+1); i < finishX-1; i++) {
					if(b[(int)startX - i][(int)startY-i] != null) {
						returnStatement = false;
						System.out.println("8");
					}
				}
			}else if(finishX-startX<0 && finishY - startY > 0) {
				for(int i = (int) (startX+1); i < finishX-1; i++) {
					if(b[(int)startX - i][(int)startY+i] != null) {
						returnStatement = false;
						System.out.println("9");
					}
				}
			}else if(finishX-startX>0 && finishY -startY < 0) {
				for(int i = (int) (startX+1); i < finishX-1; i++) {
					if(b[(int)startX + i][(int)startY-i] != null) {
						returnStatement = false;
						System.out.println("10");
					}
				}
			}
		}

		if(startX == finishX && startY == finishY) {
			returnStatement = false;
			System.out.println("12");
		}




		return returnStatement;
	}

	public String toString() {
		return "this is a queen, YASS";
	}


}
