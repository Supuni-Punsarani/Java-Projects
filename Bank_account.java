public class Bank_account {
    String accountType;
		double balance;
		Customer customer;
		
		public Bank_account(String accountType,Customer customer) {
			this.accountType=accountType;
			this.customer=customer;
			
		}
		
		public void deposit(double amount) {
			this.balance+=amount;
		}
		
		public void withdraw(double amount) throws Exception{
			if(amount>this.balance) {
				throw new Exception("Amount is greater than balance");
			}
		   this.balance-=amount;
			
		}
		
		public String getAccountInfo() {
			return this.accountType+": "+this.balance;
		}
		
		public String getCustomerInfo() {
			return this.customer.getName()+": "+this.customer.getAddress();
		}
		
		
}
