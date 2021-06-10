import java.util.Objects;

//Project Name: Queen
//Project Description: is a queen. basically an epic remix of rook and bishop
//Date: Jun 3, 2021
//Written By: Ari Steinfeld

public class Queen extends Piece {
			// The ImageIcon will be used to hold the Character's png.
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
			if(to.row != from.row && to.column != from.column)
				returnStatement = false;
			if(Math.abs(to.column - from.column) == 0) {
				for(int i = 1; i < Math.abs(to.row-from.row); i++) {
					//down
					if(to.row > from.row && !Objects.isNull(b[from.row + i][from.column])) {
						returnStatement =  false;
					}
					//up
					if(to.row < from.row && !Objects.isNull(b[from.row - i][from.column])) {

						returnStatement =  false;			
					}
				}
			}

			//Horizontal checking
			if(Math.abs(to.row - from.row) == 0) {
				//if it is moving right
				if(to.column-from.column > 0) {
					for(int i = 1; i < Math.abs(to.column-from.column); i++) {
						if(!Objects.isNull(b[from.row][from.column + i])) 
							returnStatement = false;
					}
				}
				//if it is going left
				if(to.column-from.column < 0) {
					for(int i = 1; i < Math.abs(to.column-from.column); i++) {
						if(!Objects.isNull(b[from.row][from.column - i])) 
							returnStatement = false;
					}
				}

				//if you want to know why the code looks different for left-right vs updown, its because
				//as I was troubleshooting I tried making them different, until I realized
				//the issue was in the gpannel
			}

			//checks for bishop like movement
		}else if(Math.abs(to.row - from.row) == Math.abs(to.column - from.column)){

			//checks diagonals
			if(to.row > from.row && to.column > from.column) {
				for(int i = 1; i < Math.abs(to.row - from.row); i++) {
					if(b[from.row+i][from.column+i] != null) {
						returnStatement = false;

					}
				}
			}
			if(to.row <from.row && to.column < from.column) {
				for(int i = 1; i < Math.abs(to.row - from.row); i++) {
					if(b[from.row-i][from.column-i] != null) {
						returnStatement = false;

					}
				}
			}
			if(to.row > from.row && to.column < from.column) {
				for(int i = 1; i < Math.abs(to.row - from.row); i++) {
					if(b[from.row+i][from.column-i] != null) {
						returnStatement = false;

					}
				}
			}
			if(to.row < from.row && to.column > from.column) {
				for(int i = 1; i < Math.abs(to.row - from.row); i++) {
					if(b[from.row-i][from.column+i] != null) {
						returnStatement = false;

					}
				}
			}

		}else {
			returnStatement = false;
		}






		return returnStatement;
	}

	public String toString() {
		return "QUEEN";
	}


}
