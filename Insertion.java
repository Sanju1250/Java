import java.util.Scanner;
class Insertion
{
     public static void main(String args[])
     {
     Scanner sc=new Scanner(System.in);
     Scanner sd=new Scanner(System.in);
     System.out.println("enter number of words");
     int N=sc.nextInt();
     String ss[]=new String[N];
     System.out.println("Enter the words");
     for(int i=0;i<ss.length;i++)
     {
     ss[i]=sd.nextLine();
     }
    
     for(int i=1;i<ss.length;i++)
     {
	String temp=ss[i];
	int j=i;
	while(j>0&&temp.compareTo(ss[j-1])<0)
		{
		ss[j]=ss[j-1];
		j--;
		}
		ss[j]=temp;
     }
     System.out.println("the sorted words are"); 
     for(int i=0;i<ss.length;i++)
     {
     System.out.println(ss[i]);
     }
     }
}
