import java.util.Objects;
//Project Name: pawn
//Project Description: the most important piece in chess. can't en passent
//Date: Jun 3, 2021
//Written By: Ari Steinfeld + Andy Sun
public class pawn extends Piece{
	public pawn(int player) {
		super(player);
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
		if(super.getPlayer()==1&&from.getColumn()==to.getColumn()&&(from.getRow()==6)&&(from.getRow()==to.getRow()+1||from.getRow()==to.getRow()+2)&&board[to.getRow()][to.getColumn()]==null&& Objects.isNull(board[to.row][to.column])&& Objects.isNull(board[to.row+1][to.column])) {
			canMove=true;
		}else if(super.getPlayer()==-1&&from.getColumn()==to.getColumn()&&from.getRow()==1&&(from.getRow()==to.getRow()-1||from.getRow()==to.getRow()-2)&&board[to.getRow()][to.getColumn()]==null && Objects.isNull(board[to.row][to.column])&& Objects.isNull(board[to.row-1][to.column])) {
			canMove=true;
		}else if(from.getColumn()==to.getColumn()&&from.getRow()==to.getRow()+1 && Objects.isNull(board[to.row][to.column])) {

			canMove=true;
		}/*Capturing*/else if((from.getColumn()==to.getColumn()-1||from.getColumn()==to.getColumn()+1)&&from.getRow()==to.getRow()+1&&board[to.getRow()][to.getColumn()]!=null) {
			canMove=true;
		}
		if((board[to.row][to.column] != null && board[to.row][to.column].getPlayer() == getPlayer())) {
			canMove =  false;

		}	
		if(canMove) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "pawnlol";
	}
}

