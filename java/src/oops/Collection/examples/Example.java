package oops.Collection.examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class Example {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		System.out.println("Objects inside arraylist:"+al+"Size:"+al.size());
		System.out.println("============");
		LinkedList ll=new LinkedList();
	    ll.addAll(al);
		
		ll.add(30); //small change to add here compare test example and exmple ll.add(30) and al.add(30) difference
		
		System.out.println("Objects inside arraylist:"+ll+"size:"+ll.size());
		
		// Containsall() is used to check if all the objects of one collection is //
		 //present inside another collection or not //
System.out.println("==========");
	System.out.println(ll.containsAll(al));//true
	System.out.println(al.containsAll(ll));// false
	System.out.println("========");
	System.out.println(ll);
	System.out.println(ll.remove(0));
	System.out.println(ll);
	System.out.println("==========");
	}

}
