//Project Name: Bishop
//Project Description:
//Date: Jun 10, 2021
//Written By: Andrue Harold
//Slightly Fixed By: Ari Steinfeld
public class Bishop extends Piece{
	public Bishop(){
		this(1);
	}


	public Bishop(int player){
		super(player);
		if(player ==1) {
			setImageIcon("images2/bishop1.png");
		}
		else {
			setImageIcon("images2/bishop2.png");
		}
		this.setPlayer(player);			
	}

	public boolean isValidMove(Location from, Location to, Piece[][]b) {
		

		//checks for a self capture
		if((b[to.row][to.column] != null && b[to.row][to.column].getPlayer() == getPlayer())) {
			return  false;

		}

		//checks to make sure it is a bishop move
		if(Math.abs(to.row - from.row) != Math.abs(to.column - from.column)) {
			return  false;
		}

		//checks diagonals
		if(to.row > from.row && to.column > from.column) {
			for(int i = 1; i < Math.abs(to.row - from.row); i++) {
				if(b[from.row+i][from.column+i] != null) {
					return  false;

				}
			}
		}
		if(to.row <from.row && to.column < from.column) {
			for(int i = 1; i < Math.abs(to.row - from.row); i++) {
				if(b[from.row-i][from.column-i] != null) {
					return  false;
				}
			}
		}
		if(to.row > from.row && to.column < from.column) {
			for(int i = 1; i < Math.abs(to.row - from.row); i++) {
				if(b[from.row+i][from.column-i] != null) {
					return  false;
				}
			}
		}
		if(to.row < from.row && to.column > from.column) {
			for(int i = 1; i < Math.abs(to.row - from.row); i++) {
				if(b[from.row-i][from.column+i] != null) {
					return  false;

				}
			}
		}

		return true;
	}

	public String toString() {
		return "BISHOP";
	}
}	
