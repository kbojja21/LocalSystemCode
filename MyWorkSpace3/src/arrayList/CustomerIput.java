package arrayList;

public class CustomerIput {

	public static void main(String[] args) {
		ArrayListOperation array=new ArrayListOperation();
		array.add(new Integer(5));
		array.add(new Integer(4));
		array.add(new Integer(3));
		array.add(new Integer(9));
		array.add(new Integer(1));
		array.add(new Integer(11));
		array.add(new Integer(12));
		array.add(new Integer(15));
		array.add(new Integer(17));
		for(int i=0;i<array.size();i++){
			//System.out.println(array.size());
            System.out.print(array.get(i)+" ");
        }
		Object result=array.get(2);
		System.out.println("\nElement at index two="+result);
		array.add(new Integer(9));
		
		System.out.println("Array size="+array.size());
		
		
		Object resultRemove=array.remove(2);
		System.out.println("Removed element="+resultRemove);
		
		
		for(int i=0;i<array.size();i++){
            System.out.print(array.get(i)+" ");
        }
		
		

	}

}
