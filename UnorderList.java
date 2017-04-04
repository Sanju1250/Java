package org.com;

import java.util.*;
import java.io.*;

public class UnorderList {
	
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		Scanner sd=new Scanner(System.in);
		try {
		Scanner sc = new Scanner(new File("/home/bridgeit/Desktop/JavaP/IPL.txt"));
			String st = sc.nextLine();
			System.out.println(st);

			String ss[] = st.split(" ");

			for (int i = 0; i < ss.length; i++) {
			 ls.add(ss[i]);
			}

		} catch (Exception e) {
			System.out.println("File not Found");
		}
		ls.display();
		System.out.println("Enter the word to search");
	
		String item=sd.next();
		
		boolean res=ls.compare(item);
		if(res==true)
		{
	    ls.remove(item);
		}
		else
		{
		ls.add(item);
		}
		ls.display();
		
		
	}
}
