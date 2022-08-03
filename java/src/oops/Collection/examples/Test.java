package oops.Collection.examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		 ArrayList al=new ArrayList();
		 al.add(10);
		 al.add(20);
		al.add(1, "ganga");
	  al.addAll(al);// by using addall method how to use  see here.
	  al.add(50);
		 System.out.println("Objects inside arraylist "+al+"size:"+al.size());
		 
		 LinkedList ll=new LinkedList();
		 ll.addAll(al);
		 ll.add(30);
		 System.out.println("Objects inside linkedlist :"+ll+"size:"+ll.size());
		 
	}

}
