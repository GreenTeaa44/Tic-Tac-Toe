package tic_tac_toe;
import java.util.Scanner;
public class Main {

	static int mode,turn;
	static Scanner sc = new Scanner(System.in);
	
	public static void pve()
	{
		Board board;
		Bot bot = null;
		char symbol;
		boolean flag = true;
		int grid,level;
		
		do
		{
			System.out.printf("\nWhich turn do you want to play?\n1. First\n2. Second\nChoose turn : ");
			turn = sc.nextInt();
			if(turn<1 || turn>2)
			{
				System.out.printf("Please input 1 or 2\n");
			}
			else 
			{
				turn--;
				flag=false;
			}
		}while(flag);
		
		board = new Board(turn);
		flag=true;
		
		do
		{
			System.out.printf("\nSelect Difficulty\n1. Easy\n2. Medium\n3. Hard\nDifficulty : ");
			level = sc.nextInt();
		}
		while(level>3 || level<1);
		
		switch(level)
		{
			case(1) : bot = new BotEasy();break;
			case(2) : bot = new BotMedium();break;
			case(3) : bot = new BotHard();break;
		}
		
		flag=true;
		System.out.printf("\n");
		do
		{
			if(board.getTurn() == 0)
			{
				System.out.printf("Player turn [%c]",board.getSymbol());
				board.displayBoard();
				do
				{
					System.out.printf("Please choose board number between [1 - 9] : ");
					grid = 	sc.nextInt();
					grid--;
				}while(grid<0 || grid>8 || board.getBoard(grid)!=' ');	
			}
			else
			{
				grid = bot.move(board);
			}
			flag=board.setBoard(grid);
		}while(flag);
	}
	
	public static void pvp()
	{
		boolean flag=true;
		Board board = new Board(0);
		int grid;
		System.out.printf("\n");
		do
		{
			System.out.printf("Player %d turn [%c]",board.getTurn()+1,board.getSymbol());
			board.displayBoard();
			do
			{
				System.out.printf("Please choose board number between [1 - 9] : ");
				grid = sc.nextInt();
				grid--;
			}while(grid<0 || grid>8 || board.getBoard(grid)!= ' ');
			flag=board.setBoard(grid);
			System.out.printf("\n");
		}while(flag);
	}
	
	public static void main(String[] args) {
		char symbol;
		int grid,turn,level;
		boolean flag;
		String answer;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			flag=true;
			turn=0;
			
			do
			{
				System.out.printf("Choose Mode:\n1. PVP\n2. PVE\nMode: ");
				mode = sc.nextInt();
				if(mode>2 || mode<1)
				{
					System.out.printf("Please input mode 1 or 2\n");
				}
			}while(mode>2 || mode<1);
			if(mode == 1)
			{
				pvp();
			}
			else
			{
				pve();
			}
			
			sc.nextLine();
			
			do
			{
				System.out.printf("\nDo you want to play again [ Yes || No ]? ");
				answer = sc.nextLine();
			}while(!(answer.equalsIgnoreCase("Yes")) && !(answer.equalsIgnoreCase("No")));
		}while(answer.equalsIgnoreCase("Yes"));
		System.out.printf("Thank you");
	}  
}
