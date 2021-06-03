public class pawn extends Piece{
	public pawn(int player) {
		if(player==1) {
			setImageIcon("images2/pawn1.png");
			super.setPlayer(player);
		}
		else {
			setImageIcon("images2/pawn2.png");
			super.setPlayer(player);
		}
	}
	@Override
	public boolean isValidMove(Location from, Location to, Piece[][] board) {
		int fromX=from.getColumn();
		int fromY=from.getRow();
		int toX=to.getColumn();
		int toY=to.getRow();
		
		if(/*first move*/fromX==toX
				&&(fromX==1||fromX==7)&&(toY==3||toY==5)
				&&board[fromX][toY]==null||/*regular movement*/(fromX==toX
				&&(fromX==1||fromX==7)
				&&board[fromX][toY]==null
				&&fromY==toY+1 /*capturing*/||(fromX!=toX
				&&(board[toX][toY]!=null
				&&board[toX][toY].getPlayer()!=board[fromX][fromY].getPlayer())
				&&(fromY==toY+1
				&&(fromX==toX+1||fromX==toX-1))))) {
			return true;
		}
		else
			return false;
	}
}

