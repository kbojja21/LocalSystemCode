package bankSystem;

public class BankOperations {
BankDto[] bankArray=new BankDto[5];//it holds customer details.
{
	BankDto dt01=new BankDto("kiran",123,569740);	
	BankDto dt02=new BankDto("kumar",124,569732);
	BankDto dt03=new BankDto("sai",128,56940);	
	BankDto dt04=new BankDto("shiva",126,569780);
	BankDto dt05=new BankDto("cason",127,169740);	
	bankArray[0]=dt01;
	bankArray[1]=dt02;
	bankArray[2]=dt03;
	bankArray[3]=dt04;
	bankArray[4]=dt05;
}
	
public boolean login(String nameOfCustomer,int accountNumber)
	{
	int count=0;
		for(BankDto d : bankArray)
		{
			if(nameOfCustomer.equals(d.getNameOfCustomer().trim())&&accountNumber==d.accountNumber)
			{
				++count;
				break;
			}
		}
		if(count!=0)
			return true;
		else
	 	    return false;
	}
public float deposit(float money,int accountNumber)
{
	float tempMoney=0;
	int count=0;
	for(BankDto d : bankArray)
	{
		if(accountNumber==d.accountNumber)
		{
		  tempMoney=d.getMoney()+money;
			d.setMoney(tempMoney);
			++count;
			break;
		}
	}
	if(count!=0)
		return tempMoney;
	else
 	    return  -1;
	
}
public float withdraw(float money,int accountNumber)
{
	float tempMoney=0;
	int count=0;
	for(BankDto d2 : bankArray)
	{
		if(accountNumber==d2.accountNumber)
		{
			if(d2.getMoney()>=money)
			{
		  tempMoney=d2.getMoney()-money;
			d2.setMoney(tempMoney);
			++count;
			break;
			}
			else
				System.out.println("Insufficient balance");
		}
	}
	if(count!=0) 
		return tempMoney;
	else
 	    return  -1;
}
public float checkStatement(int accountNumber)
{
	float tempMoney=0;
	int count=0;
	for(BankDto d1 : bankArray)
	{
		if(accountNumber==d1.accountNumber)
		{
			
		  tempMoney=d1.getMoney();
			++count;
			break;
			
		}
	}
	if(count!=0)
		return tempMoney;
	else
 	    return  -1;
}

}
