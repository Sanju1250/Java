package BridgeLab;

import java.util.Scanner;

public class Notes {
	
		static int array[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
		static int count = 0;
	    static int one,two,five,ten,twenty,fifty,hundread,fivehun,thousand=0;
		static int function(int n) {
		for (int i = array.length - 1; i >= 0; i--) {
			if (n >= array[i]) {
				count++;
				int sum=n-array[i];
				switch(array[i])
				{
				case 1000:thousand++;
				         break;
				case 500:fivehun++;
				         break;
				case 100:hundread++;
				         break;
				case  50:fifty++;
				         break;
				case  20:twenty++;
				         break;
				case  10:ten++;
				          break;
				case   5:five++;
				         break;
				case   2:two++;
				         break;
				case   1:one++;
				
				         
				}
				return function(sum);
			}
		}
		System.out.println("minimum Number of notes neded is "+count);
		System.out.println("the Notes are as Follows");
		System.out.println("1000 *"+thousand+"="+1000*thousand);
		System.out.println("500  *"+fivehun+ "="+500*fivehun);
		System.out.println("100  *"+hundread+"="+100*hundread);
		System.out.println("50   *"+fifty   +"="+50*fifty);
		System.out.println("20   *"+twenty  +"="+20*twenty);
		System.out.println("10   *"+ten     +"="+10*ten);
		System.out.println("5    *"+five    +"="+5*five);
		System.out.println("2    *"+two     +"="+2*two);
		System.out.println("1    *"+one     +"="+1*one);
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amont in rupees");
		int amount = sc.nextInt();
		function(amount);

	}
}
