package FlightBookingSystem;

public class Updates {
	int[] bookedSeats = new int[11];

	CustomerDB[] customerArray = new CustomerDB[10];

	public boolean checkAvailability(int seatNum) {

		if (bookedSeats[seatNum] == seatNum)
		{
	//	System.out.println("sgr");
			return false;
		}

		return true;

	}

	public int bookSeat(int seatNum) {
		bookedSeats[seatNum] = seatNum;
		return seatNum;
//System.out.println("fs");
	}

	public void updateCustomer(CustomerDB cust, int i) {
		customerArray[i] = cust;
	}
	public void displayCustomer()
	{
		for(int i=0;i<customerArray.length;i++){
			System.out.println(customerArray[i]);
		}
	}
	
	public void cancelSeat(CustomerDB cust)
	{
//		System.out.println(cust.getSeatNum());
//		System.out.println(customerArray[cust.getSeatNum()]);
		for(int i=0;i<customerArray.length;i++)
		{
			//System.out.println(customerArray[i].getCustPassport());
			if(customerArray[i].getCustPassport().equals(cust.getCustPassport()))
			{
				if(customerArray[i].getSeatNum()==cust.getSeatNum())
				{
					bookedSeats[cust.getSeatNum()] = 0;
					customerArray[cust.getSeatNum()]=null;
					System.out.println("your seat successfuly cancelled");
//					String res="your seat successfuly cancelled";
//					return res;
				}
				else
					System.out.println("Seat number does not match");
					//throw new MissMatchException("Seat number does not match");
				return;
			}
			
//			else 
//				System.out.println("Passport number does not match");
		}
		System.out.println("Passport number does not match");
		//throw new MissMatchException("Passport number does not match");
	}

}
