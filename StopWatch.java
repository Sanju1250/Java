import java.util.Scanner;
class StopWatch
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	long StartTime=0;
	long StopTime=0;
	long ElapsedTime=0;
	System.out.println("Press Number 1 to start the timer");
	int number=sc.nextInt();
	if(number==1)
	{
	StartTime=System.currentTimeMillis();
	}
	else
	{
	System.out.println("Press Number 1 to start the timer");
	number=sc.nextInt();
	if(number==1)
	{
	StartTime=System.currentTimeMillis();
	}
	}
	
	System.out.println("Press Number 2 to stop the timer");
	number=sc.nextInt();
	if(number==2)
	{
	StopTime=System.currentTimeMillis();
	}
	else
	{
	System.out.println("Press Number 2 to stop the timer");
	number=sc.nextInt();
	if(number==2)
	{
	StopTime=System.currentTimeMillis();
	}
	}
	
	ElapsedTime=StopTime-StartTime;
	System.out.println("ElapsedTime in millisecond is "+ElapsedTime);
	System.out.println("ElapsedTime in second is "+ElapsedTime/1000);
	System.out.println("Thank you");
	
}
}
