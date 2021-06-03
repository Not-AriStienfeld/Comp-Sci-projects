import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;
public class King extends Piece {
	private ImageIcon image;			// The ImageIcon will be used to hold the Character's png.
	// This png must be saved in the images folder and will be loaded 
	// in the constructor.

	// method: Default constructor - see packed constructors comments for a description of parameters.
	public King(){
		this(1);
	}

	// method: Character's packed constructor
	// description: Initialize a new Character object.
	// parameters: int player - should be either 1 or 2. 1 for yellow team, 2 for black team.
	public King(int player){
		super(player);
		if(player ==1) {
			setImageIcon("images2/king1.png");
		}
		else {
			setImageIcon("images2/king2.png");
		}
		this.setPlayer(player);			
	}

	// method: Character's packed constructor
	// description: Initialize a new Character object.
	// parameters: int player - should be either 1 or 2. 1 for yellow team, 2 for black team.
	public King(int player, String imagePath){
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
		



		if(Math.abs(to.row - from.row)  > 1 || Math.abs(to.column - from.column)    > 1) {
			System.out.println("hi");
			System.out.println(Math.abs(to.row - from.row) + " ROW" + to.row + " " + from.row);
			System.out.println(Math.abs(to.column - from.column) + "COLUMN" + to.column + " " + from.column);
			return false;
			
		}
		if(b[to.row][to.column] != null && b[to.row][to.column].getPlayer() == b[from.row][from.column].getPlayer())
			return false;

		return true;

	}

	public String toString() {
		return "this is a king";
	}


}