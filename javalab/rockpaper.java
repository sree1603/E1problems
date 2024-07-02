import java.util.*;
//3 times
class RockPaperScissors3
{
	public static void main(String args[])
	{
		System.out.println("ROCK-PAPER-SCISSCORS");
		Random r = new Random();
		//loop
		int i=0;
		int score1=0,score2=0;
		int rock= 0;
		int paper = 1;
		int scissor = 2;
		while(i<3)
		{
			int a = r.nextInt(3);
			int b = r.nextInt(3);
			if(a==b)
			{
				while(a==b)
				{
				b=r.nextInt(3);
				}
			}
			System.out.println("a value: "+a);
			System.out.println("b value: "+b);
			if((a==rock && b==scissor)||(a==scissor && b==paper)||(a==paper && b==rock))
				score1++;
			else
				score2++;
			if(score1>score2)
				System.out.println("player1 wins the game in trial_"+i);
			else
				System.out.println("player2 wins the game in trial_"+i);
			i++;
		}
		if(score1>score2)
			System.out.println("Finally,player1 wins the game");
		else
			System.out.println("Finally,player2 wins the game");
			
	}
}
