package tic_tac_toe;
import java.util.Random;
import java.util.ArrayList;


public class BotEasy extends Bot{

	
	BotEasy(){
		
	}
	
	Random rand = new Random();
	
	@Override
	public int move(Board board)
	{
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
