import java.util.Scanner;
class Leap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the year");
int year=sc.nextInt();
if(year%400==0)
System.out.println("the given year is leap");
else if(year%100==0)
System.out.println("the given yesr is leap");
else if(year%4==0)
System.out.println("the given year is leap");
else
System.out.println("the given year is not leap");
}
}
