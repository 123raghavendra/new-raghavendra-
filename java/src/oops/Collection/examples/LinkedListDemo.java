package oops.Collection.examples;

import java.util.LinkedList;

public class LinkedListDemo {

	
	public static void main(String[] args) {
		LinkedList X =new LinkedList();
		X.add(10);
		X.add(20);
		X.add(30);
		
		System.out.println(X);
		
		
 System.out.println("=========");
		for(int i=0;i<X.size();i++) {
			System.out.println(X.get(i));
		
		}
	System.out.println("==========");
 for (int i=X.size()-1;i>=0;i--) {
	 System.out.println(X.get(i));
 }

}
}
		
	



