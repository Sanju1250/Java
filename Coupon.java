import java.util.*;
class Coupon
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the Distinct coupon number");
int CouponNumber=sc.nextInt();
int i=0;int count=0;
Set s=new LinkedHashSet();

Random r=new Random();
while(i<CouponNumber)
{
int RandomNumber=r.nextInt(CouponNumber);
count++;
s.add(RandomNumber);
i=s.size();
}
System.out.println(s);
System.out.println("the number of times coupon generated "+count);
}
}
