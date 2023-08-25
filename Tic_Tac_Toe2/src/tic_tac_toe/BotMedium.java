package tic_tac_toe;
import java.util.ArrayList;
import java.util.Random;

public class BotMedium extends Bot{
	
	BotMedium(){
		
	}
	
	@Override
	public int move(Board board)
	{
		if(board.getBoard(0) == board.getSymbol())
		{
			if(board.getBoard(1) == board.getSymbol() && board.getBoard(2) == ' ')
			{
				return(2);
			}
			else if(board.getBoard(2) == board.getSymbol() && board.getBoard(1) == ' ')
			{
				return(1);
			}
			else if(board.getBoard(4) == board.getSymbol() && board.getBoard(8) == ' ')
			{
				return(8);
			}
			else if(board.getBoard(8) == board.getSymbol() && board.getBoard(4) == ' ')
			{
				return(4);
			}
			else if(board.getBoard(3) == board.getSymbol() && board.getBoard(6) == ' ')
			{
				return(6);
			}
			else if(board.getBoard(6) == board.getSymbol() && board.getBoard(3) == ' ')
			{
				return(3);
			}
		}
		if(board.getBoard(1) == board.getSymbol())
		{
			if(board.getBoard(2) == board.getSymbol() && board.getBoard(0) == ' ')
			{
				return(2);
			}
			else if(board.getBoard(4) == board.getSymbol() && board.getBoard(7) == ' ')
			{
				return(7);
			}
			else if(board.getBoard(7) == board.getSymbol() && board.getBoard(4) == ' ')
			{
				return(4);
			}
		}
		if(board.getBoard(2) == board.getSymbol())
		{
			if(board.getBoard(4) == board.getSymbol() && board.getBoard(6) == ' ')
			{
				return(6);
			}
			else if(board.getBoard(6) == board.getSymbol() && board.getBoard(4) == ' ')
			{
				return(4);
			}
			else if(board.getBoard(5) == board.getSymbol() && board.getBoard(8) == ' ')
			{
				return(8);
			}
			else if(board.getBoard(8) == board.getSymbol() && board.getBoard(5) == ' ')
			{
				return(5);
			}
		}
		if(board.getBoard(3) == board.getSymbol())
		{
			if(board.getBoard(6) == board.getSymbol() && board.getBoard(0) == ' ')
			{
				return(0);
			}
			else if(board.getBoard(4) == board.getSymbol() && board.getBoard(5) == ' ')
			{
				return(5);
			}
			else if(board.getBoard(5) == board.getSymbol() && board.getBoard(4) == ' ')
			{
				return(4);
			}
		}
		if(board.getBoard(4) == board.getSymbol())
		{
			if(board.getBoard(5) == board.getSymbol() && board.getBoard(3) == ' ')
			{
				return(3);
			}
			else if(board.getBoard(6) == board.getSymbol() && board.getBoard(2) == ' ')
			{
				return(2);
			}
			else if(board.getBoard(7) == board.getSymbol() && board.getBoard(1) == ' ')
			{
				return(1);
			}
			else if(board.getBoard(8) == board.getSymbol() && board.getBoard(0) == ' ')
			{
				return(0);
			}
		}
		if(board.getBoard(5) == board.getSymbol())
		{
			if(board.getBoard(8) == board.getSymbol() && board.getBoard(2) == ' ')
			{
				return(2);
			}
		}
		if(board.getBoard(6) == board.getSymbol())
		{
			if(board.getBoard(7) == board.getSymbol() && board.getBoard(8) == ' ')
			{
				return(8);
			}
			else if(board.getBoard(8) == board.getSymbol() && board.getBoard(7) == ' ')
			{
				return(7);
			}
		}
		if(board.getBoard(7) == board.getSymbol())
		{
			if(board.getBoard(8) == board.getSymbol() && board.getBoard(6) == ' ')
			{
				return(6);
			}
		}
		
		Random rand = new Random();
		ArrayList<Integer> grid = new ArrayList<Integer>();	
		for(int i=0;i<9;i++)
		{
			if(board.getBoard(i) == ' ')
			{
				grid.add(i);
			}
		}
		return(grid.get(rand.nextInt(grid.size())));
	}

}
