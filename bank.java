import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		bank Bank = new bank();
		Bank.run();
		
     }
	
	public void run() {
		System.out.println("---Welcome to the bank---");
		
		System.out.println("What is your name?");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		System.out.println("Hello "+name+"! We are creating checking and savings account for you.");
		Customer customer=new Customer(name);
		
		System.out.println("What is your address?");
		String address=scanner.next();
		customer.setAddress(address);
		

		Bank_account checkingaccount=new Bank_account("checking",customer);
		Bank_account savingsaccount=new Bank_account("savings",customer);
		System.out.println();
		System.out.println("Customer Info:");
		System.out.println(checkingaccount.getCustomerInfo());
		
		System.out.println();
		System.out.println("Checking Account:");
		System.out.println(checkingaccount.getAccountInfo());
		System.out.println("Savings Account:");
		System.out.println(savingsaccount.getAccountInfo());
		
		System.out.println();
		System.out.println("Amount(decimal) to deposit into your checking account?");
		double amount=scanner.nextDouble();
		checkingaccount.deposit(amount);
		
		System.out.println();
		System.out.println("Amount(decimal) to deposit into your saving account?");
		amount=scanner.nextDouble();
		savingsaccount.deposit(amount);
		
		System.out.println(checkingaccount.getAccountInfo());
		System.out.println(savingsaccount.getAccountInfo());
		

		System.out.println();
		System.out.println("Amount(decimal) to withdraw from your checking account?");
		amount=scanner.nextDouble();
		try {
			checkingaccount.withdraw(amount);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("Amount(decimal) to withdraw from your savings account?");
		amount=scanner.nextDouble();
		try {
			savingsaccount.withdraw(amount);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
}
	
}
