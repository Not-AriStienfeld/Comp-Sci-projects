public class pawn extends Piece{
	private boolean hasMoved;
	public pawn(int player) {
		super(player);
		hasMoved=false;
		if(player==1) {
			setImageIcon("images2/pawn1.png");
		}
		else {
			setImageIcon("images2/pawn2.png");
		}
	}
	@Override
	public boolean isValidMove(Location from, Location to, Piece[][] board) {
		boolean canMove=false;
		if(from.getColumn()==to.getColumn()&&hasMoved==false&&(from.getRow()==to.getRow()+1||from.getRow()==to.getRow()+2))
			canMove=true;
		else if(from.getColumn()==to.getColumn()&&from.getRow()==to.getRow()+1) {
			canMove=true;
		}else if(true) {
			canMove=true;
		}
			
		//THIS IS A PLACEHOLDER
		if(canMove) {
			hasMoved=true;
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "pawnlol";
	}
}

