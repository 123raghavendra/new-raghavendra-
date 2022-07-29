package oops.Collection.examples;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		
		/*add() is used to add an object into the collection */		
	l.add(10);
	l.add(20.32);
	l.add(10);
	l.add(null);
	l.add("java");
	
	System.out.println(l);
	
	/*size() is used to return the length of the collection */
	System.out.println(l.size());
	
	/*get() is used to return an object based on the index position */
	System.out.println(l.get(3));
	
	//System.out.println(l.get(100)); IndexOutOfBoundException
	
	
	/*contains() is used to check if the object is present in the collection or not */
	
	System.out.println(l.contains("java"));
	System.out.println(l.contains("java"));

	/*remove() is used to remove an object based on the index position */
	 l.remove(3);
	System.out.println(l);
	
	/* isEmpty() is used to check if the collection is empty or not*/
	//l.isEmpty();// wrong way to check  is empty
	//
	//System.out.println(l.isEmpty());
	
	/*clear() will remove all the objects from collection*/
	
	l.clear();
	
	System.out.println(l.isEmpty());
	
	
	
	ArrayList X=new ArrayList();
	X.add(20);
	X.add(10);
	X.add(30);
	X.add(10);
	X.add(30);
	X.add(60);
	
	System.out.println(X);
	
	/*indexof() is used to find the index position of an object and first occurrence in case of duplication */
	
	System.out.println(X.indexOf(30));
	System.out.println(X.indexOf(10));
	System.out.println(X.indexOf(100));	// -1 if the object is not present
	

	
	/* lastIndexOf() is used to find the last  index position of an object */
	
	System.out.println(X.lastIndexOf(10));

	

	
	
	
	
	
	
	}

}
