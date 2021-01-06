package customListSet;

import java.util.Arrays;


public class ArrayOperation {
	
	public Integer[] myArray=new Integer[10]; 
	public int actualElements=0;
	
	public Integer get(int index) throws ArrayOutOfBound
	{
		if(index<actualElements)
			return myArray[index];
		else throw new ArrayOutOfBound("Please chech the index");
	}
	
	public synchronized void add(Integer obj) throws NullValueException
	{
		 if(myArray.length-actualElements <= (myArray.length)*0.1)
		 {
				 increaseArraySize();
		 }
		if(obj!=null)
		{
			int count=0;
			for(int i=0;i<myArray.length;i++)
				{
				if(obj.equals(myArray[i]))
						{
						myArray[i]=obj; 
						count++;
						//System.out.println("count: "+count);
						break;
						}
				}
			if(count==0){
			for(int i=0;i<myArray.length;i++)
				{
						if(myArray[i]==null)
						{
						myArray[i] = obj;
						actualElements++;
						//System.out.println("elemCount: "+actualElements);
						break;
						}
				}
			}
		}
		else
			throw new NullValueException("Null values are not allowed");
	
	}
	
	
	public void display()
	{
		String result="";
		Arrays.sort(myArray, 0, actualElements);
		for(int i=0;i<myArray.length;i++)
		{
			if(myArray[i]!=null){
				result+=myArray[i]+"\n";
			}	
		}
		System.out.println("Elements after sorting:"+result);
	}
	public void increaseArraySize()
	{
		myArray=Arrays.copyOf(myArray, myArray.length*2 );
		System.out.println("New size of array="+myArray.length);
	}
	
	public int size()
	{
	return actualElements;
	}
	
//	public void bubbleSort()
//	{
//		int temp=0 ,i,j;
//		Integer[] tempArray=myArray;
//		for(i=0;i<tempArray.length;i++)
//		{
//			for(j=1;j<tempArray.length-i;j++)
//			{
//				if(tempArray[j-1]>tempArray[j])
//				{
//					temp=tempArray[j-1];
//					tempArray[j-1]=tempArray[j];
//					tempArray[j]=temp; 
//				}
//			}
//	}
//		//return myArray;
//		myArray=tempArray;
//		for(int j1=0;j1<myArray.length;i++)
//		{
//			System.out.println(get(j1)+"");
//		}
//		}
	
	
}
