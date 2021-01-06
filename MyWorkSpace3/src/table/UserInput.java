package table;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
        TableOperation table=new TableOperation();

        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Enter an integer to print it's multiplication table");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication table of "+n+" is :-");
        table.multiplication(n);

	}

}
