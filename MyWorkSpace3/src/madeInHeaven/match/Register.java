package madeInHeaven.match;

import madeInHeaven.dto.CustomerDetail;


public class Register {
	CustomerDetail[] customerArray=new CustomerDetail[3];
	
	public CustomerDetail[] getCustomerArray() {
		return customerArray;
	}
	public boolean CheckName(String name)
	{
			for(int j=0; j<3; j++)
			{
				if(customerArray[j] != null && name.equals(customerArray[j].getName()))
				{
					System.out.println("Name already exists choose a different name.");
					return false;
				}
			}
		
		return true;
	}
	public void AddCustomer(CustomerDetail customer, int i)
	{
		customerArray[i] = customer;
	}

	

}
