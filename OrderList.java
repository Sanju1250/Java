package BridgeLab;

import java.util.*;
import java.io.*;

public class OrderList {
	static Scanner sc=null;
	public static void main(String[] args) {
		List ls = new LinkedList();
		int s=0;
		try {
			sc = new Scanner(new File("/home/bridgeit/workspace/sss.txt"));
			String st = sc.nextLine();
			String ss[] = st.split(" ");
			int array[] = new int[ss.length];
			for (int i = 0; i < array.length; i++) {
				int num = Integer.parseInt(ss[i]);
				array[i] = num;
			}
			Arrays.sort(array);
			System.out.println("thw elements in the file is");
			for(int i=0;i<array.length;i++)
			{
			System.out.println(array[i]);
		    ls.add(array[i]);
			}
			sc=new Scanner(System.in);
			System.out.println("enter the number");
			int number=sc.nextInt();
			int flag=0;
			for(int i=0;i<array.length;i++)
			{
				if(array[i]==number)
				{
					flag=1;
					System.out.println("the element is found");
					
					
				}
			}
			if(flag==0)
			{
				ls.add(number);
			}else
			{
				int a[]=new int[array.length-1];
				
				for(int k=0;k<array.length;k++)
				{
					if(number==array[k])
					{
						k++;
					}
					a[s]=array[k];
					s++;
				}
				for(int i=0;i<a.length;i++)
				{
					System.out.println(a[i]);
				}
				return;
						
			}
			int b[]=new int[array.length+1];
			for(int m=0;m<b.length;m++)
			{
				b[m]=(int)ls.get(m);
			}
			Arrays.sort(b);
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}
			return;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
