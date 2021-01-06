package collectionsPractice;

import java.util.Scanner;

public class TestCustomCollections {
	public static void main(String[] args) throws CustomCollectionException
	{
		//object for custom collections	
		System.out.println("Custome Collections");
		boolean cond = true;
		while(cond){
			System.out.println("Initial Length");
			//object for scanner
			Scanner scan = new Scanner(System.in);
			int size = scan.nextInt();
			if(size <= 0){
				//default constructor
				GvbCustomCollections<Object> account = new GvbCustomCollections<Object>();
				cond = functionality(cond, scan, account);
			}
			else{
				//custom constructor
				GvbCustomCollections<Object> account = new GvbCustomCollections<Object>(size);
				cond = functionality(cond, scan, account);
			}
			
		}	
	}

	private static boolean functionality(boolean cond, Scanner scan, GvbCustomCollections<Object> account)
			throws CustomCollectionException {
		while(cond){
			System.out.println("Select\n 1. Add Element \n 2. Display List \n 3. Get Element By Index \n 4. Exit");
			int choice = scan.nextInt();
			switch(choice){
			case 1:
				//to add element
				System.out.println("Please input the value to be sorted");
				int value = scan.nextInt();
				System.out.println("___________________________________________");
				try{
					boolean res = account.add(value);
					if(res){
						System.out.println("Added successfully");
					}
					else{
						System.out.println("Add failed");
					}
				}
				catch(CustomCollectionException cCE){
					throw cCE;
				}
				break;
			case 2:
				//display list
				System.out.println("___________________________________________");
				String result = account.display();
				if(result == null){
					System.out.println("List is Initial");
				}
				else{
					System.out.println(result);
				}
				
				break;
			case 3:
				//get by index
				System.out.println("Select an Index to display");
				System.out.println("___________________________________________");
				int index = scan.nextInt();
				try{
					Object element = account.getByIndex(index);
					System.out.println(element);
				}
				catch(IndexOutOfBoundsException cCE){
					throw cCE;
				}
				break;
			default:
				cond = false;
				break;
			}
		}
		return cond;
	}
}
