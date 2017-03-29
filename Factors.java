import java.util.Scanner;
class Factors
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	//Set s=new HashSet();
	System.out.println("enter the number to find prime Factors");
	int Number=sc.nextInt();
	for(int i=2;i<=Number/2;i++)
	{
	if(Number%i==0)
	{
	int temp=2;
	while(temp<=i/2)
	{
	if(i%temp==0)
	{
	break;
	}
	temp++;
	}
	if(temp>i/2)
	{	
	System.out.println(i);
	}

	}
	}

}
}
