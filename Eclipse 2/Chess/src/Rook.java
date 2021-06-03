import java.util.Objects;

//Project Name: Rook
//Project Description: is a rook
//Date: Jun 2, 2021
//Written By: Ari Steinfeld
//Notes: made with blood, sweat, and A LOT OF TEARS!
public class Rook extends Piece{

	public Rook(int player) {
		super();

		//sets the icon based on player
		if(player == 1) {
			setImageIcon("images2/rook1.png");
		}else {
			setImageIcon("images2/rook2.png");
		}
		this.setPlayer(player);			
	}
	public Rook(int player, String imagePath){
		super(player, imagePath);	
	}

	//name: isValidMove
	//does: checks if move is valid (duh)
	//working? not quite, can still take own peices
	public boolean isValidMove(Location from, Location to, Piece[][]b){
		
		
	
		//I decided to take this approach because it would help me troubleshoot by being able to find multiple errors is one move.
		boolean canMove = true;
		
		//makes sure it is a valid rook move and not a random click
		if(to.row != from.row && to.column != from.column)
			canMove = false;
		
		
		//works, I'm an idiot
		if((b[to.row][to.column] != null && b[to.row][to.column].getPlayer() == getPlayer()))
			canMove =  false;

		//gonna be honest, I shouldn't need this here, but the code doesn't really work if I remove it. 
		if(Math.abs(to.column - from.column) == 1 && Math.abs(to.row - from.row) == 1) {
			canMove =  false;
		}

		//Vertical checking
		if(Math.abs(to.column - from.column) == 0) {
			for(int i = 1; i < Math.abs(to.row-from.row); i++) {
				//down
				if(to.row > from.row) {
					if(!Objects.isNull(b[from.row + i][from.column])) 
						canMove =  false;
				}
				//up
				if(to.row < from.row) {
					if(!Objects.isNull(b[from.row - i][from.column])) 
						canMove =  false;			
				}
			}
		}

		//Horizontal checking
		if(Math.abs(to.row - from.row) == 0) {
			//if it is moving right
			if(to.column-from.column > 0) {
				for(int i = 1; i < Math.abs(to.column-from.column); i++) {
					if(!Objects.isNull(b[from.row][from.column + i])) 
						canMove = false;
				}
			}
			//if it is going left
			if(to.column-from.column < 0) {
				for(int i = 1; i < Math.abs(to.column-from.column); i++) {
					if(!Objects.isNull(b[from.row][from.column - i])) 
						canMove = false;
				}
			}
			
			//if you want to know why the code looks different for left-right vs updown, its because
			//as I was troubleshooting I tried making them different, until I realized
			//the issue was in the gpannel
		}


		return canMove;
	}	
}
