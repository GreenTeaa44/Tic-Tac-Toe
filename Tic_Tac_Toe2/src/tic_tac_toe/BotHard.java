package tic_tac_toe;

public class BotHard extends Bot{
	char ai='O',player='X',move;
	
	BotHard(){
		
	}
	
	@Override
	public int move(Board board)
	{		
		int score,max=-100,move=1;
		for(int i=0;i<9;i++)
		{
			if(board.getBoard(i) == ' ')
			{
				board.setBoardBotHard(i,ai);
				score = minimax(board,0,false);
				board.setBoardBotHard(i,' ');
				if(score>max)
				{
					max=score;
					move=i;
				}
			}
		}
		return(move);
	}
	
	public int minimax(Board board,int depth,boolean isMax)
	{
		int score = checkWin(board);
		if(score!=-2)
		{
			return(score);	
		}
		
		if(isMax)
		{
			int best=-100;
			for(int i=0;i<9;i++)
			{
				if(board.getBoard(i) == ' ')
				{
					board.setBoardBotHard(i,ai);
					score = minimax(board,depth+1,false);
					board.setBoardBotHard(i,' ');
					if(score>best)
					{
						best = score;
					}
				}
			}
			return(best);
		}
		else
		{
			int best=100;
			for(int i=0;i<9;i++)
			{
				if(board.getBoard(i) == ' ')
				{
					board.setBoardBotHard(i,player);
					score = minimax(board,depth+1,true);
					board.setBoardBotHard(i,' ');
					if(score<best)
					{
						best = score;
					}
				}
			}
			return(best);
		}
	}
	
	public int checkWin(Board board)
	{
		if(board.getBoard(0) == board.getBoard(1) && board.getBoard(0) == board.getBoard(2))
		{
			if(board.getBoard(0)==player)
			{
				return(-1);
			}
			else if(board.getBoard(0)==ai)
			{
				return(1);
			}
		}
		else if(board.getBoard(0) == board.getBoard(4) && board.getBoard(0) == board.getBoard(8))
		{
			if(board.getBoard(0)==player)
			{
				return(-1);
			}
			else if(board.getBoard(0)==ai)
			{
				return(1);
			}
		}
		else if(board.getBoard(0) == board.getBoard(3) && board.getBoard(0) == board.getBoard(6))
		{
			if(board.getBoard(0)==player)
			{
				return(-1);
			}
			else if(board.getBoard(0)==ai)
			{
				return(1);
			}
		}
		else if(board.getBoard(1) == board.getBoard(4) && board.getBoard(1) == board.getBoard(7))
		{
			if(board.getBoard(1)==player)
			{
				return(-1);
			}
			else if(board.getBoard(1)==ai)
			{
				return(1);
			}
		}
		else if(board.getBoard(2) == board.getBoard(4) && board.getBoard(2) == board.getBoard(6))
		{
			if(board.getBoard(2)==player)
			{
				return(-1);
			}
			else if(board.getBoard(2)==ai)
			{
				return(1);
			}
		}
		else if(board.getBoard(2) == board.getBoard(5) && board.getBoard(2) == board.getBoard(8))
		{
			if(board.getBoard(2)==player)
			{
				return(-1);
			}
			else if(board.getBoard(2)==ai)
			{
				return(1);
			}
		}
		else if(board.getBoard(3) == board.getBoard(4) && board.getBoard(3) == board.getBoard(5))
		{
			if(board.getBoard(3)==player)
			{
				return(-1);
			}
			else if(board.getBoard(3)==ai)
			{
				return(1);
			}
		}
		else if(board.getBoard(6) == board.getBoard(7) && board.getBoard(6) == board.getBoard(8))
		{
			if(board.getBoard(6)==player)
			{
				return(-1);
			}
			else if(board.getBoard(6)==ai)
			{
				return(1);
			}
		}
		else
		{
			int total=0;
			for(int i=0;i<9;i++)
			{
				if(board.getBoard(i)!=' ')
				{
					total++;
				}	
			}
			if(total==9)
			{
				return(0);
			}
		}
		return(-2);
	}
}
