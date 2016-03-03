
public class Game_End 
{
	private BoardGame theBoard;
	private Player_game player1;
	private Player_game player2;
	private Scanner input;
	public Game_End()
	{
		input = new Scanner(System.in);
		this.theBoard=new BoardGame();
		this.player1= new Player_game("player1", 'X');
		this.player2 = new Player_game("player2", '0');
		
	}
	public void play()
	{
		Player_game currPlayer = this.player1;
		
		do{
		this.theBoard.display();
		this.getMove(currPlayer);
		if(currPlayer == this.player1)
		{
			currPlayer = this.player2;
		}
		else
		{
			currPlayer = this.player1;
		}
		}
		while(this.theBoard.winner() == false);
		if(currPlayer == this.player1)
		{
			System.out.println("The Winner is: " + this.player2.getName());
		}
		else
		{
			System.out.println("The Winner is: " + this.player1.getName());
		}
	}
	public void getMove(Player_game player)
	{
		int move;
		int row=move/10-1;
		int col = move%10-1;
		do
		{

			System.out.println("Please enter the col:");
			col = this.input.nextInt();
		}
		while

			(this.theBoard.charMove(player.getMove(), col)==false);
	}

}
