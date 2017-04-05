import java.util.Scanner;
class Gambler
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the amount of money you have");
	int Stake=sc.nextInt();
	System.out.println("enter the amount of money to reach the target");
	int Goal=sc.nextInt();
	System.out.println("enter the number of step");
	int Step=sc.nextInt();
	System.out.println("enter the how many times you want to play the game");
	int PlayGame=sc.nextInt();
	int count=0;
	double WinPercent=0.0;
	double LossPercent=0.0;
	for(int i=0;i<PlayGame;i++)
	{
	double j=Math.random();
	if(j>0.5)
	{
	Stake=Stake+Step;
	count++;
	}
	else
	{
	Stake=Stake-Step;
	}
	if(Stake==Goal)
	{
	break;
	}
	}
	WinPercent=(count*100)/Step;
	LossPercent=100-WinPercent;
	System.out.println("Number of Win is "+count);
	System.out.println("Percentage  of Win is "+WinPercent);
	System.out.println("Percentage of loss is "+LossPercent);


	}
}
