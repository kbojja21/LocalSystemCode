package customListSet;

public class CustomerInput {

	public static void main(String[] args) throws NullValueException, ArrayOutOfBound 
	{
		
		ArrayOperation arrayOperation=new ArrayOperation();
		arrayOperation.add(new Integer(2));
		arrayOperation.add(new Integer(4));
		arrayOperation.add(new Integer(6));
		arrayOperation.add(new Integer(1));
		arrayOperation.add(new Integer(1));
		System.out.println("number of elements in array right now:"+arrayOperation.size());
		arrayOperation.add(new Integer(45));
		arrayOperation.add(new Integer(7));
		arrayOperation.add(new Integer(11));
		arrayOperation.add(new Integer(13));
		arrayOperation.add(new Integer(44));
		arrayOperation.add(new Integer(6));
		arrayOperation.add(new Integer(12));
		arrayOperation.add(new Integer(1));
       
		System.out.println("number of elements in array right now:"+arrayOperation.size());
		System.out.println("Element at given index:"+arrayOperation.get(5));
		arrayOperation.display();
		
	}

}
