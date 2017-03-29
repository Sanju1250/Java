import java.util.*;
class Cop
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the Distinct coupon number");
int CouponNumber=sc.nextInt();
int count=0;
int array[]=new int[CouponNumber];
Random r=new Random();
for(int i=0;i<CouponNumber;i++)
{
int k=r.nextInt(CouponNumber);
count++;
array[i]=k;

for(int j=0;j<i;j++)
{
if(array[j]==k)
{
i--;
break;
}
}

}
for(int m=0;m<array.length;m++)
{
System.out.print(array[m]+" ");
}
System.out.println("the number of time coupon generated is "+count);

}
}
