import java.util.Scanner;
class Hormonic 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the Hormonic Number");
int   Number=sc.nextInt();
double temp=0.0;
double result=0.0;
for(int i=1;i<=Number;i++)
{
double j=(double)i;
temp=1/j;
result=result+temp;
}
System.out.println("the Hormonic value is "+result);
}
}
