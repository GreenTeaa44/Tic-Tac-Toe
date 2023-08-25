package tic_tac_toe;

public class Grid {
	private char shape;
	
	Grid(char shape)
	{
		this.shape = shape;
	}
	
	public void setShape(char shape)
	{
		this.shape = shape;
	}
	
	public char getShape()
	{
		return(this.shape);
	}
	
}
