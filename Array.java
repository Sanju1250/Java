import java.util.Scanner;
class Array
{
static Scanner sc=new Scanner(System.in);
static int[][] readIntArray()
{
System.out.println("enter the number of rows");
 int row=sc.nextInt();
 System.out.println("enter the number of column");
 int col=sc.nextInt();
int array[][]=new int[row][col];
System.out.println("enter integer  element in the array");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
array[i][j]=sc.nextInt();
}
}
return array;
}
static double[][] readDoubleArray()
{
System.out.println("enter the number of rows");
 int row=sc.nextInt();
 System.out.println("enter the number of column");
 int col=sc.nextInt();
double array1[][]=new double[row][col];
System.out.println("enter double element in the array");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
array1[i][j]=sc.nextDouble();

}
}
return array1;
}
static void displayIntArray(int a[][])
{
System.out.println("entered integer elements in the Array are as follows");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[0].length;j++)
{
System.out.println(a[i][j]);
}
}
}

static void displayDoubleArray(double b[][])
{
System.out.println("entered double elements in the Array are as follows");
for(int i=0;i<b.length;i++)
{
for(int j=0;j<b[0].length;j++)
{
System.out.println(b[i][j]);
}
}
}
public static void main(String args[])
{
int a[][]=readIntArray();
double b[][]=readDoubleArray();
displayIntArray(a);
displayDoubleArray(b);
}
}
