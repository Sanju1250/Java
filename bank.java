package BridgeLab;

public class bank {
	String name;
	double accBal;
	long accnum;

	public bank(String arg1, double arg2, long arg3) {
		this.name = arg1;
		this.accBal = arg2;
		this.accnum = arg3;
    }

	

	void deposit(double amt) {
		System.out.println("Hin Welcome");
		accBal = accBal + amt;
		System.out.println("your accont balance is " + accBal);
		System.out.println("Thank you! you have succesfully Deposited");
	}

	void withdraw(double amt) {
		if (accBal > amt) {
			System.out.println("Hi, welcome");
			accBal = accBal - amt;
			System.out.println("Your accont balance is " + accBal);
			System.out.println("Thank you! you have succesfully withdraw your money");
		}
		else
		{
			System.out.println("Sorry! insufficient balance");
			System.out.println("Thank you!");
		}
	}

	void balanceEnquiry() {
		System.out.println("Hi, welcome");
		System.out.println("your account balance is " + accBal);
		System.out.println("Thank you!");
	}
}
