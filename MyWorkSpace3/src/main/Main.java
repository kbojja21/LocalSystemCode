package main;

import java.util.Scanner;

import madeInHeaven.dto.CustomerDetail;
import madeInHeaven.match.Register;
import madeInHeaven.match.SearchMatch;


public class Main {

	public static void main(String[] args) {
		int i=0;
		Register customerRegister = new Register();
		while(i<3){
			CustomerDetail customer = new CustomerDetail();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your name ");
	customer.setName(scan.nextLine());
	System.out.println("Enter your telephone number ");
	customer.setNumber(scan.nextLong());
	System.out.println("Enter one of your hobbie ");
	String hobby = scan.next();

	customer.setHobby(hobby);
	if(customerRegister.CheckName(customer.getName()))
	{
			customerRegister.AddCustomer(customer, i);
			i++;
	}
	}
	
	SearchMatch search = new SearchMatch();
	System.out.println(customerRegister.getCustomerArray()[0]);
	boolean result = search.findMatch(customerRegister.getCustomerArray());
	if(!result)
		System.out.println("No Match Found.");
		

}
}