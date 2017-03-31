import java.util.Scanner;
class Bubble
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many integer do you want");
	int N=sc.nextInt();
	int array[]=new int[N];
	for(int i=0;i<array.length;i++)
	{
	array[i]=sc.nextInt();
	}
	for(int i=0;i<array.length;i++)
	{
	  for(int j=i+1;j<array.length;j++)
	  {
	     if(array[i]>array[j])
	      {
	       int temp=array[i];
	       array[i]=array[j];
	       array[j]=temp;
	      }
	  }
	}
	System.out.println("Sorted elements are");
	for(int i=0;i<array.length;i++)
	{
	System.out.println(array[i]);
	}
	}
}
