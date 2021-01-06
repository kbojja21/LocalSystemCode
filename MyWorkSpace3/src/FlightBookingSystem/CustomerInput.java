
package FlightBookingSystem;

import java.util.Scanner;

public class CustomerInput {

	public static void main(String[] args) {
		int i = 0;
		Updates update = new Updates();
		while (i < 5) 
		{
			try{
			System.out.println("select 1 for Booking and 2 to Cancel the seat");
			Scanner scan=new Scanner(System.in);
			
			int  input=scan.nextInt();
			switch(input)
			{
				case 1:
					bookFlight(i,update);
				    i++;
					break;
				case 2:
					cancelFlight(update);
					i--;
					break;
				default :
					System.out.println("Enter valid input");
					
					
			}
			}catch(Exception e){
				System.out.println("Please enter either 1 or 2");
			}
		}

		update.displayCustomer();
	}

	public static void bookFlight(int i,Updates update) {

	//	Updates update = new Updates();
		boolean checkSeat = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.nextLine();
		CustomerDB customerDetails = new CustomerDB();
		customerDetails.setNameOfCust(name);
		System.out.println("Enter your passport number");
		String passport = scan.nextLine();
		customerDetails.setCustPassport(passport);
		while (checkSeat) {
			try
			{
			System.out.println("Enter the seat number from 1 to 10");
			int seatNum = scan.nextInt();
			boolean flagCheck=update.checkAvailability(seatNum);
			if (flagCheck) {
				customerDetails.setSeatNum(seatNum);
				int result=update.bookSeat(seatNum);
				System.out.println("You have successfully booked seat number "+result);
				//update.updateCustomer(customerDetails, i);
				// System.out.println(update.bookedSeats[seatNum]);
				checkSeat = false;
			} else
				System.out.println("Seat already booked");
				update.updateCustomer(customerDetails, i);
		}catch(Exception e)
		{
			System.out.println("Please enter digit between 1 to 10");
		}
	}
	}
	public static void cancelFlight(Updates update)
	{
		CustomerDB customerDetails = new CustomerDB();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your passport number");
		String passportNum=scan.nextLine();
		customerDetails.setCustPassport(passportNum);
		System.out.println("Enter your reserved seat number to cancel");
		int seatNum=scan.nextInt();
		customerDetails.setSeatNum(seatNum);
		
		update.cancelSeat(customerDetails);
		
		
	}

}
