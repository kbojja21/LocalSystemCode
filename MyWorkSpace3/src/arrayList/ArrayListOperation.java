package arrayList;

import java.util.Arrays;

public class ArrayListOperation {
public Object[] myArray=new Object[10]; 
public int actualArraySize=0;

public Object get(int index)
	{
	if(index<actualArraySize)
	return myArray[index];
	else throw new ArrayIndexOutOfBoundsException();
	}
public void add(Object obj)
	{
	
	 if(myArray.length-actualArraySize <= (myArray.length)*0.1){
		// System.out.println(myArray.length);
		 increaseArraySize();
     }
     myArray[actualArraySize++] = obj;
	
	}
public Object remove(int index)
	{
	if(index<actualArraySize)
	{
		Object obj = myArray[index];
		//myArray[index]=null;	
		int temp=index;
	while(temp<actualArraySize)
	{
		
		myArray[temp]=myArray[temp+1];
		//myArray[temp+1]=null;
		temp++;
		
	}
	
	actualArraySize--;
	
	return obj;
	}
	else
		throw new ArrayIndexOutOfBoundsException();
	}
public void increaseArraySize()
	{
		myArray=Arrays.copyOf(myArray, myArray.length*2 );
		System.out.println("New size of array="+myArray.length);
	}
public int size()
	{
	return actualArraySize;
	}
//public Object get(Object value)
//	{
//	Object result;
//	int count=0;
//		for(int i=0;i<myArray.length;i++)
//		{
//			
//			 result=get(i);
//			if(result.equals(value))
//			{
//				++count;
//				break;
//			}
//		}
//		if(count!=0)
//			return result;
//		else
//			return null;
//	}

}
