package pizzaCenter;

import java.util.Scanner;

public class CustomerInput {

	public static void main(String[] args) {
		int i=1;
		while(i<=10)
		{
			Pizza p=new Pizza();
			System.out.println("Enter 1-order , 2-update and 3-cancel");
			Scanner scan=new Scanner(System.in);
			int option=scan.nextInt();
			
			switch(option)
			{
			case 1:
			{
				String name = takeName(scan);
				int cheese = takeCheese(scan);
				int tomato = takeTomato(scan);
				int onions = takeOnions(scan);
				boolean orderStatus=p.order(name, cheese, tomato, onions,i);
				processResponse(orderStatus,"Order");
				i++;
				break;
			}
			case 2:
			{
				String name = takeName(scan);
				int cheese = takeCheese(scan);
				int tomato = takeTomato(scan);
				int onions = takeOnions(scan);
				boolean orderStatus=p.update(name, cheese, tomato, onions);
				processResponse(orderStatus,"Update");
				break;
			}
			case 3:
			{
				String name = takeName(scan);
				boolean orderStatus=p.cancel(name);
				processResponse(orderStatus,"Cancel");
				i--;
				break;
			}
			default :
				System.out.println("please enter valid number");
				break;
			}
		}

	}

	private static int takeOnions(Scanner scan) {
		int onions=0;
		while(true)
		{
		try{
		System.out.println("Enter topping onion count");
		 onions=scan.nextInt();
		 break;
		}catch(Exception e)
			{
			System.out.println("please enter digit");
			}
		}
		return onions;
	}

	private static int takeTomato(Scanner scan) {
		int tomato=0;
		while(true)
			{
		try{
		System.out.println("Enter topping tomato count");
		 tomato=scan.nextInt();
		 break;
		}catch(Exception e)
		{
			System.out.println("please enter digit");
		}
			}
		return tomato;
	}

	private static int takeCheese(Scanner scan) {
		int cheese=0;
		while(true){
		try{
		System.out.println("Enter topping cheese count");
		 cheese=scan.nextInt();
		 break;
		}catch(Exception e)
			{
			System.out.println("please enter digit");
			}
					}
		return cheese;
	}

	private static String takeName(Scanner scan) {
		System.out.println("Enter your name");
		String name=scan.next();
		return name;
	}

	private static void processResponse(boolean orderStatus,String operationName) {
		if(orderStatus)
		{
			System.out.println(operationName+"  is success");
		}
		else
		{
			System.out.println(operationName+"  is failed");
		}
	}

}
