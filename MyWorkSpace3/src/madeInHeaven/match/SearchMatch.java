package madeInHeaven.match;

import madeInHeaven.dto.CustomerDetail;

public class SearchMatch {
public boolean findMatch(CustomerDetail[] custArray)
{
	boolean flag = false;
	for(int i = 0; i< 3; i++)
	{
		for(int j = i + 1; j<3; j++ )
		{
			if(custArray[i].getHobby().equals(custArray[j].getHobby()))
			{
				System.out.println("Best Match found:"+custArray[i].getName()+" and "+custArray[j].getName());
				flag = true;
			}
		}
	}
	return flag;
}
}
