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
System.out.println("=========");
 int [] x= {10,20,30};
 System.out.println(x.length);  // using for for array
 
 System.out.println("==========");
  String c="Java";
 System.out.println(c.length());   //using for string
 
 
 System.out.println("==========");
 System.out.println(X.size()); //  for collections
 
}
}
		
	



