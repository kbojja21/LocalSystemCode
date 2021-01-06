package collectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListUserDefine {

	public static void main(String[] args) {
		Product p1=new Product("iphone",850,6);
		Product p2=new Product("nokia",650,5);
		Product p3=new Product("nexus",750,8);
		Product p4=new Product("samsung",750,10);
		
	//	ArrayList<Product> highPerformance =new ArrayList<>();
		LinkedList<Product> moreMemory=new LinkedList<>();
//		
//		highPerformance.add(p1);
//		//System.out.println(highPerformance);
//		highPerformance.add(p2);
//		highPerformance.add(p3);
//		highPerformance.remove(2);
//		Product pro=highPerformance.get(1);
//		System.out.println(pro);
//		//System.out.println(highPerformance);
		
		moreMemory.add(p1);
		moreMemory.add(p2);
		moreMemory.add(p3);
		
		moreMemory.remove(1);
		moreMemory.add(p4);
//		Iterator<Product> read= highPerformance.iterator();
//		while(read.hasNext())
//		{
//			Product p=read.next();
//			System.out.println(p.name +":"+ p.price+":"+p.quantity );
//		}
//		for(int i=0;i<highPerformance.size();i++)
//		{
//			Product p=highPerformance.get(i);
//			System.out.println(p);
//		}
//		for(Product p : highPerformance)
//		{
//			System.out.println(p);
//		}
		for(Product p : moreMemory)
			{
				System.out.println(p);
		}
		

	}

}
