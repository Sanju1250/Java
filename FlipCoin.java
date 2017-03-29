import java. util.Scanner;
class FlipCoin
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number of times to Flip a Coin");
int Number=sc.nextInt();
int Head=0;
double HeadPercent=0.0;
double TailPercent=0.0;
for(int i=0;i<Number;i++)
{
double RandomNumber=Math.random();
if(RandomNumber<0.5)
{
Head++;
}
}
HeadPercent=(Head*100)/Number;
TailPercent=100-HeadPercent;
System.out.println("The percent of Head is "+HeadPercent);
System.out.println("The percent of Tail is "+TailPercent);
}
}

