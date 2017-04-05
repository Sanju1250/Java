import java.util.Scanner;
class Integer
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the integer Value");
	int value=sc.nextInt();
	int array[]=new int[value];
	int sum=0;		
	int count=0;
	System.out.println("enter the elements in the Array");
	for(int i=0;i<array.length;i++)
	{
	array[i]=sc.nextInt();
	}
	System.out.println("the Distinct tripples are");
	for(int i=0;i<array.length-2;i++)
	{
	for(int j=i+1;j<array.length-1;j++)
	{
	for(int k=j+1;k<array.length;k++)
	{
	sum=array[i]+array[j]+array[k];
	if(sum==0)
	{
	count++;
	System.out.println(+array[i]+","+array[j]+","+array[k]);

	}
	}
	}
	}
	System.out.println("Number of Distinct tripple is "+count);
	}
}
