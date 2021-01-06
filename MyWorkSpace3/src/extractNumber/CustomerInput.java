package extractNumber;

import java.util.Scanner;

public class CustomerInput {

	public static void main(String[] args) {
		NumberExtract number=new NumberExtract();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your comment");
		String mail=scan.nextLine();
		String result=number.extractNumber(mail);
		if(result.length()==10)
		System.out.println("Customer Mobile Number="+result);
		else if(result.length()<10)
			System.out.println("Customer Mobile Number is invalid="+result);

	}

}
