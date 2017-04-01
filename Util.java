import java.util.Arrays;
class Util
{
  static int binarySearch(int a[],int s)
  {int item=s;
   int low=0;
   int high=a.length-1;
     while(low<=high)
     {
        int mid=(low+high)/2;
        if(a[mid]==item)
        {
         System.out.println("the item found");
         return a[mid];
        }
	else if(a[mid]<item)
	low=mid+1;
	else
	high=mid-1;
     }
	System.out.println("the item not found");
	return -1;
  }
  static int[] bubbleSort(int a[])
  {
        for(int i=0;i<a.length;i++)
	{
	    for(int j=i+1;j<a.length;j++)
	    {
	    	if(a[i]<a[j])
		{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
	    }
	}
 return a;  
  }
  static int[] insertionSort(int a[])
  {
     for(int j=1;j<a.length;j++)
     {
      int temp=a[j];
      int i=j-1;
         while(i>0&&a[j]>temp)
         {
          a[i+1]=a[i];
          i--;
         }
         a[i+1]=temp;
  
     }
     return a;
  }
  static void binarySearchString(String a[],String item)
  {
     int low=0;
			int high=a.length-1;
			while(low<=high)
			{
			int mid=(low+high)/2;
			if(a[mid].equalsIgnoreCase(item)==true)
			{
			System.out.println("The given word is found");
			return;
			}
			else if(a[mid].compareTo(item)<0)
			{
			low=mid+1;
			}
			else
			{
			high=mid-1;
			}
			
			}
			System.out.println("the given word is not found");
  }
  static void display(int a[])
  {
     for(int i=0;i<a.length;i++)
    {
    System.out.println(a[i]); 
    }
  }
  static String[] insertionSortString(String a[])
  {
    for(int i=1;i<a.length;i++)
     {
	String temp=a[i];
	int j=i;
	while(j>0&&temp.compareTo(a[j-1])<0)
		{
		a[j]=a[j-1];
		j--;
		}
		a[j]=temp;
     } 
  return a;
  }
  static void displayString(String[] a)
  {
    for(int i=0;i<a.length;i++)
  System.out.println(a[i]);
  }
  static String[] bubbleSortString(String a[])
  {
     for(int i=0;i<a.length-1;i++)
     {
        for(int j=i+1;j<a.length;j++)
        {
           if(a[i].compareTo(a[j])>0)
           {
           String temp=a[i];
           a[i]=a[j];
           a[j]=temp;
           }        
        }
     }
     return a;
  }
}
