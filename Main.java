import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		double deposit;
		double withdraw;
		Bank bank = new Bank(242579, 100000);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to deposit");
		deposit = sc.nextDouble();
		bank.deposit(deposit);
		
		System.out.println("Enter the amount you want to withdraw");
		withdraw = sc.nextDouble();
		bank.withdraw(withdraw);
		bank.showdetails();
	}
}