package oops.Collection.List.ArrayList;
import java.util.*;
public class Demo1 {
	
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
	l.add(1);
	l.add(2);
	l.add(1);
	l.add(2);
	l.add(1);
	l.add(2);
	l.add(1);
	l.add(2);
	l.add(1);
	l.add(2);
	l.add(1);
	l.add(2);
	
	System.out.println(l);
	System.out.println(l.size());
	System.out.println(l.get(2));
	System.out.println(l.toString());
	System.out.println(l.remove(4));
	System.out.println(l);
	System.out.println(l.equals(args));
	
	}

}
