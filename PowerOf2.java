import java.util.Scanner;
class PowerOf2
{
static int power(int n,int p)
{
int pw=1;
while(p>0)
{
pw=pw*n;
p--;
}
return pw;
}

  	public static void main(String args[])
	{
	System.out.println("Enter the command line argument is N");
 	String N = args[0];	
	for(int i=0;i<Integer.parseInt(N);i++)
	{
	int res=power(2,i);
	System.out.println(res);
	}
	}
}
