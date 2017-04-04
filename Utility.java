import java.util.Scanner;
class Utility
{
   public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in); 
   Scanner sd=new Scanner(System.in);
   Util u=new Util();  
   int a[]={1,3,5,9,15,20};
   String s[]={"apple","bat","drama","cat","aaaaa"};
   System.out.println("enter the number to search");
   int Number=sc.nextInt();
   u.binarySearch(a,Number);
   int b[]=u.bubbleSort(a);
   System.out.println("the sorted elements are");
   u.display(b);
   int c[]=u.insertionSort(a);
   System.out.println("the sorted elements are");
   u.display(c);
   System.out.println("enter the word to search");
   String item=sd.next();
   u.binarySearchString(s,item);
   String z[]=u.insertionSortString(s);
   System.out.println("the sorted string is");
   u.displayString(z);
   String y[]=u.bubbleSortString(s);
   System.out.println("the sorted string is");
   u.displayString(y);
   }
}
