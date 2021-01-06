package pizzaCenter;

public class Pizza 
{
	Dto[] pizzaArray=new Dto[10];//it holds customer orders.And the 1st
	                                 // customer gets first order.
	
	public boolean order(String name,int cheese,int tomato,int onions,int i)
	{
		if(pizzaArray[i-1]==null)
		{
		Dto newCustomer=new Dto(name, cheese, tomato, onions);
		pizzaArray[i-1]=newCustomer;
		return true;
		}
		else
			return false;
		
	
	}
	public boolean update(String name,int cheese,int tomato,int onions)
	{
		Dto tempDto=new Dto(name, cheese, tomato, onions);
		int count=0;
		for(Dto d:pizzaArray)
		{
			if(d!=null){
			String tempName=d.getNameOfCustomer();
			if(tempName.equals(name))
			{
				d=tempDto;
				++count;
				break;
			}}
			
		}
		if(count!=0)
		{
			return true;
		}
		else
			return false;
	
		
	
	}
	public boolean cancel(String name)
	{
		int count=0;
		for(Dto d: pizzaArray)
		{
			if(d!=null){
			String tempName=d.getNameOfCustomer();
			if(tempName!=null&&tempName.equals(name))
			{
				d=null;
				++count;
				break;
			}}
		}
		if(count!=0)
		{
			return true;
		}
		else
			return false;
		
	
	}
	
	

}

