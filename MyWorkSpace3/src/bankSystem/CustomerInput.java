package bankSystem;

import java.util.Scanner;

public class CustomerInput {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BankOperations bank=new BankOperations();
		while(true)
		{
			System.out.println("Enter 1-Deposit  2-Withdraw  3-ChechStatement");
			int option=scan.nextInt();
			switch(option)
			{
			case 1:
			  {
					float money = loginNtakeMoney(scan, bank,"deposit");
					int accountNumber = takeAccountNumber(scan);
					float depositResponse;//it receives the response of deposit operation.
					depositResponse=bank.deposit(money,accountNumber);
					System.out.println("your balance ="+depositResponse);
				break;
			  }
			case 2:
			  {
				  float money = loginNtakeMoney(scan, bank,"withdraw");
				  int accountNumber = takeAccountNumber(scan);
				   float withdrawResponse;//it receives the response of withdraw operation.
				  withdrawResponse=bank.withdraw(money,accountNumber);
				  System.out.println("your balance "+withdrawResponse);
				break;		
			  }	
			case 3:
			  {
				  float money = loginNtakeMoney(scan, bank,"checked");
				  int accountNumber = takeAccountNumber(scan);
				  float checkResponse;//it receives the response of checkStatement operation.
				  checkResponse=bank.checkStatement(accountNumber);
				  System.out.println("your balance "+checkResponse);
				break;		
			  }	
			 default:
			 {
				 System.out.println("please enter valid digit");
				 break;
			 }
			}
		
		}

	}

	private static float loginNtakeMoney(Scanner scan, BankOperations bank,String type) {
		loginOperation(scan, bank);
		float money = takeAmount(scan,type);
		return money;
	}

	private static void loginOperation(Scanner scan, BankOperations bank) {
		System.out.println("Enter your login details");
		String name = takeName(scan);
		int accountNumber = takeAccountNumber(scan);
		boolean loginResponse;//it receives the response of login operation.
		loginResponse=bank.login(name, accountNumber);
		if(loginResponse)
		{
			System.out.println("welcome");
		}
		else
		{
			System.out.println("Login failed");
			//return;
			loginNtakeMoney(scan, bank,"withdraw");
		}
	}

	private static float takeAmount(Scanner scan,String type) {
		System.out.println("Enter amount to be "+type);
		float money=scan.nextFloat();
		return money;
	}

	private static int takeAccountNumber(Scanner scan) {
		System.out.println("Account Number");
		int accountNumber=scan.nextInt();
		return accountNumber;
	}

	private static String takeName(Scanner scan) {
		System.out.println("Name");
		String name=scan.next();
		return name;
	}

}
