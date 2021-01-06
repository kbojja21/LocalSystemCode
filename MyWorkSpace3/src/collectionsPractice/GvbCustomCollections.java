package collectionsPractice;

import java.util.Arrays;

public class GvbCustomCollections<E> implements ICustonCollection{
	public transient Object[] myList;
	public boolean result;
	public int size;
	public int remSize;
	public int actSize;
	public Class<? extends Object> className;
	//default constructor
	public GvbCustomCollections(){
		myList = new Object[5];
		this.size = myList.length;
		this.remSize = myList.length;
	}
	//customizable constructor
	public GvbCustomCollections(int i){
		myList = new Object[i];
		this.size = i;
		this.remSize = i;
	}
	//@Override
	public synchronized boolean add(Object obj) throws CustomCollectionException{
		// TODO Auto-generated method stub
		if(className == null){
			className = obj.getClass();
		}
		else{
			if(className != obj.getClass()){
				throw new TypeMismatchException("Data Type Mismatch");
			}
		}
		incrementSize();
		String objType = "";
		if(obj != null){
			if(myList == null){
				addUniqueValue(obj);	
			}
			else{
				objType = checkForUnique(obj, objType);
				if(objType.equalsIgnoreCase("dup")){
					result = true;
				}
				else{
					addUniqueValue(obj);
				}
				//int actSize = actSize;
				
				Arrays.sort(myList, 0, actSize);
			}
		}
		else{
			throw new NullObjectElement("Null Input");
		}
		return result;
	}
	//extract method to check for uniqueness
	private String checkForUnique(Object obj, String objType) {
		for(int i = 0; i<myList.length; i++){
			if(myList[i]==obj){
				myList[i] = obj;
				objType = "dup";
				break;
			}
		}
		return objType;
	}
	//extract method to add unique value
	private void addUniqueValue(Object obj) {
		for(int i = 0; i<myList.length; i++){
			if(myList[i]==null){
				myList[i] = obj;
				result = true;
				remSize--;
				actSize++;
				break;
			}
		}
	}
	//method to display list
	@Override
	public String display() {
		String result = "";
		for(int i = 0; i < myList.length; i++){
			if(myList[i] != null){
				result += myList[i].toString()+"\n";
			}
		}
		return result;
	}
	//method to get value by index
	@Override
	public E getByIndex(int index) throws IndexOutOfBoundsException{
		E element;
		if(index > myList.length){
			throw new IndexOutOfBoundsException("Invalid Index");
		}
		else{
			 element = (E) myList[index - 1];//type cast array list element as generic type
		}
		return element;
	}
	
	private void incrementSize() {
		int remCap = remSize/size;
		if(remCap<0.5){
			this.size = this.size * 2;
			this.remSize = this.size - this.remSize;
			myList = Arrays.copyOf(myList, size);
		}
	}
}
