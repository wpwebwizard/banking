class Bank{
	int accountno;
	double balance;

	Bank(int accountno, double balance){
		this.accountno = accountno;
		this.balance = balance;
		System.out.println("Current balance : " + balance);
	}

	public void deposit(double amount){
		if(amount>0){
			balance += amount;
			System.out.println(amount + " Deposited in your account : " + accountno);
		}
	}

	public void withdraw(double amount){
		if(amount > 0 && balance >= amount){
			balance = balance - amount;
			System.out.println(amount + " Withdrawn from your account : " + accountno);
		}
		else{
			System.out.println("Insuffucient funds or Invalid amount");
		}
	}

	public double getbalanec(){
		return balance;
	}

	public void showdetails(){
		System.out.println("New Balance = Account no : " + accountno + " Balance : " + balance);
	}
}