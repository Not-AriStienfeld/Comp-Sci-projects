//Project Name: pawn
//Project Description: the most important piece in chess. can't en passent, Promotion is in the GraphicsPanel class.
//Date: Jun 3, 2021
//Written By: Andy Sun
public class pawn extends Piece{
	public pawn(int player) {
		super(player);
		if(player==1) {
			//white
			setImageIcon("images2/pawn1.png");
		}
		else {
			//black
			setImageIcon("images2/pawn2.png");
		}
	}
	@Override
	public boolean isValidMove(Location from, Location to, Piece[][] board) {
		if(/*Moving 2 up from the start as white*/super.getPlayer()==1&&from.getColumn()==to.getColumn()&&(from.getRow()==6)&&(from.getRow()==to.getRow()+1||from.getRow()==to.getRow()+2)&&board[to.getRow()][to.getColumn()]==null&& board[to.row][to.column]==null&& board[to.row+1][to.column]==null
				||/*Moving 2 up from the start as black*/(super.getPlayer()==-1&&from.getColumn()==to.getColumn()&&from.getRow()==1&&(from.getRow()==to.getRow()-1||from.getRow()==to.getRow()-2)&&board[to.getRow()][to.getColumn()]==null && board[to.row][to.column]==null&& board[to.row-1][to.column]==null
				||/*moving normally for white*/(from.column == to.column && getPlayer() == 1 && from.row == to.row +1  && board[to.row][to.column]==null
				||/*moving normally for black*/(from.column == to.column && getPlayer() == -1 && from.row == to.row -1 && board[to.row][to.column]==null
				||/*capturing for white*/(getPlayer()==1&&(from.getColumn()==to.getColumn()-1||from.getColumn()==to.getColumn()+1)&&from.getRow()==to.getRow()+1&&board[to.getRow()][to.getColumn()]!=null && board[to.row][to.column].getPlayer() != getPlayer()
				||/*capturing for black*/(getPlayer()==-1&&(from.getColumn()==to.getColumn()-1||from.getColumn()==to.getColumn()+1)&&from.getRow()==to.getRow()-1&&board[to.getRow()][to.getColumn()]!=null && board[to.row][to.column].getPlayer() != getPlayer())))))) {
			return true;
		}	
		return false;
	}
	//used by GraphicsPanel to promote pawns
	@Override
	public String toString() {
		return "pawn";
	}
}

