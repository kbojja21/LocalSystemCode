package madeInHeaven;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		int i=0;
		while(i<3){
			CustomerDetail custval=new CustomerDetail();
	Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		
        
		System.out.println("Enter your hobby");
		String hobby=scan.nextLine();
		System.out.println("Enter mobile number");
        long num=scan.nextLong();
        i++;
		}
	}

}
