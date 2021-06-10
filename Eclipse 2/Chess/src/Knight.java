
//Project Name:Knight
//Project Description: a cool class that he can't even use lol
//Date: Jun 10, 2021
//Written By: Elson Lin
public class Knight extends Piece {

	// The ImageIcon will be used to hold the Character's png.
	// This png must be saved in the images folder and will be loaded
	// in the constructor.
	// This int will represent which team the piece is, 1 for yellow team,
	// 2 for black team.

	// method: Default constructor - see packed constructors comments for a description of parameters.
	public Knight() {
		this(1);

	}

	// method: Character's packed constructor
	// description: Initialize a new Character object.
	// parameters: int player - should be either 1 or 2. 1 for yellow team, 2 for black team.
	public Knight(int player) {
		super();
		if (player == 1) {
			setImageIcon("images2/Knight1.png");
			this.setPlayer(player);
		} else {

			setImageIcon("images2/Knight2.png");
		}
		this.setPlayer(player);

	}

	// method: Character's packed constructor
	// description: Initialize a new Character object.
	// parameters: int player - should be either 1 or 2. 1 for yellow team, 2 for black team.
	public Knight(int player, String imagePath) {
		super(player, imagePath);
	}



	// method: isValidMove
	// description: This method checks to see if a move is valid.
	// Returns whether or not the attempted move is valid.
	// @param - Location from - the location that the piece will be moved from
	// @param - Location to - the location that the piece will be moved to
	// @param - Piece[][]b - the chess board.  a two dimensional array of pieces.
	// return - boolean - true if the move is valid 
	public boolean isValidMove(Location from, Location to, Piece[][] b) {
		if (b[to.row][to.column] != null && b[to.row][to.column].getPlayer() == b[from.row][from.column].getPlayer() || !(Math.abs(to.row - from.row) == 2 && Math.abs(to.column - from.column) == 1
				|| (Math.abs(to.row - from.row) == 1 && Math.abs(to.column - from.column) == 2))) {
			return false;
		}
		return true;
	}


	// method: draw
	// description: This method is used to draw the image onto the GraphicsPanel.  You shouldn't need to 
	//				modify this method.
	// parameters: Graphics g - this object draw's the image.
	//			   Component c - this is the component that the image will be drawn onto.
	//			   Location l - a Location that determines where to draw the piece.


	public String toString() {
		return  "This is a Knight";
	}

}
