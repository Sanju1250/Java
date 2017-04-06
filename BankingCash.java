package BridgeLab;

import java.util.*;

public class BankingCash {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue q = new PriorityQueue();
		double amount=0;
		System.out.println("add people to queue");
		bank b=new bank("sss",10000,1234);
		System.out.println("please select operation");
		System.out.println("enter 1 for withdraw");
		System.out.println("enter 2 for deposit");
		System.out.println("enter 3 for balance enquiry");
		int opertion = sc.nextInt();
		switch (opertion) {
		case 1:
			System.out.println("Enter the amount");
		    amount = sc.nextDouble();
			b.withdraw(amount);
			break;
		case 2:
			System.out.println("Enter the amount");
			amount = sc.nextDouble();
			b.deposit(amount);
			break;
	    case 3:b.balanceEnquiry();
		   break;
		default:
			System.out.println("Invalid operation Thank you!");

		}


	}

}
