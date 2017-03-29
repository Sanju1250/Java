import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
class Factors
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Set s=new HashSet();
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
	s.add(i);
	}

	}
	}
	Iterator it=s.iterator();
	while(it.hasNext())
	{
	Object o=it.next();
	System.out.println(o);
	}
}
}
