package tic_tac_toe;

public class Board {
	private char[] board = new char[9];
	private char[] symbol = {'X','O'};
	private Grid grid;
	private int turn = 0; 
	private int total = 0;
	private boolean flag = false;
	Main main = new Main();
	
	Board(int turn)
	{
		for(int i=0;i<9;i++)
		{
			board[i]=' ';
		}
		this.turn=turn;
	}
	
	public boolean setBoard(int noGrid)
	{
		if(symbol[turn]=='X')
		{
			grid = new Grid('X');
		}
		else
		{
			grid = new Grid('O');
		}
		board[noGrid] = grid.getShape();
		total+=1;
		return(checkBoard());
	}
	
	public boolean checkBoard()
	{
		if(board[4] == grid.getShape())
		{
			if(board[0] == grid.getShape() && board[8] == grid.getShape())
			{
				flag=true;
			}
			else if(board[2] == grid.getShape() && board[6] == grid.getShape())
			{
				flag=true;
			}
			else if(board[1] == grid.getShape() && board[7] == grid.getShape())
			{
				flag=true;
			}
			else if(board[3] == grid.getShape() && board[5] == grid.getShape())
			{
				flag=true;
			}
		}
		else if(board[0] == grid.getShape())
		{
			if(board[1] == grid.getShape() && board[2] == grid.getShape())
			{
				flag=true;
			}
			else if(board[3] == grid.getShape() && board[6] == grid.getShape())
			{
				flag=true;
			}
		}
		else if(board[8] == grid.getShape())
		{
			if(board[6] == grid.getShape() && board[7] == grid.getShape())
			{
				flag=true;
			}
			else if(board[2] == grid.getShape() && board[5] == grid.getShape())
			{
				flag=true;
			}
		}
		
		System.out.printf("\n");
		
		if(flag)
		{
			displayBoard();
			if(main.mode == 1)
			{
				System.out.printf("Congratulation Player %d Win\n",turn+1);
			}
			else
			{
				if(0!=this.turn)
				{
					System.out.printf("Congratulation Bot Win\n");
				}
				else
				{
					System.out.printf("Congratulation Player Win\n");
				}
			}
			return(false);
		}
		else if(total==9)
		{
			displayBoard();
			System.out.printf("Game is draw\n");
			return(false);
		}
		turn = (turn+1)%2;
		return(true);
	}
	
	public void setBoardBotHard(int i,char x)
	{
		board[i]=x;
	}
	
	public void displayBoard()
	{
		for(int i=0;i<9;i+=3)
		{
			System.out.printf("\n  %c | %c | %c \n",board[i],board[i+1],board[i+2]);
			if(i==0 || i==3)
			{
				System.out.printf(" -----------");
			}
		}
	}
	
	public char getBoard(int noGrid)
	{
		return(board[noGrid]);
	}
	
	public int getTurn()
	{
		return(turn);
	}
	
	public Grid getGrid()
	{
		return(grid);
	}
	
	public char getSymbol()
	{
		return(symbol[turn]);
	}
}
