package oops.Collection.examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class Runner {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		
		System.out.println("Objects Inside ArrayList:"+al+"size:"+al.size());
		System.out.println("=========");
		LinkedList ll=new LinkedList();
		ll.addAll(al);
		ll.add(30);
		
		System.out.println("Objects Inside LinkedList:"+ll+"size"+ll.size());
		System.out.println("=======");
//Removeall() is used to remove all the objects of one collection from another collection
		ll.removeAll(al);
		System.out.println("Objects inside linkedlist :"+ll+"size"+ll.size());
		
	//dont understand this method how to remove the ll 
		ll.remove(ll);
	 System.out.println("objects inside linkedlist"+ll+"size"+ll.size());
	}

}
