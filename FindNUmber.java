import java.util.*;
class FindNumber
{ 
   static int function(int low,int high)
   {
    Scanner sc=new Scanner(System.in);
    if(high-low==1)
    return low;
    int mid=(low+high)/2;;
    System.out.println("is your number is less than "+mid);
    boolean status=sc.nextBoolean();
     if(status==true)
     return function(low,mid);
     else return function(mid,high);
   }

	public static void main(String args[])
	{	
	Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int N=sc.nextInt();
	System.out.println("think one number between 0 to N-1");
	int high=N-1;
        int num=function(0,high);
        System.out.println("your number is "+num);


	}
}
