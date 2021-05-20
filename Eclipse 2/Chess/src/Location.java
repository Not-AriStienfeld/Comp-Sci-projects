
public class Location {
	public int row;
	public int column;

	public Location(){
		this(0,0);
	}
	
	public Location(int r, int c){
		row = r;
		column = c;
	}
	
	public int getRow(){
		return row;
	}
	
	public int getColumn(){
		return column;
	}
	
	public void setRow(int r){
		row = r;
	}
	
	public void setColumn(int c){
		column = c;
	}
}
