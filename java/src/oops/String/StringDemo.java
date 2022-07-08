package oops.String;

public class StringDemo {
	public static void main(String[] args) {
		
		String name="raghu";
		String name1="raghu";
		
		System.out.println(name==name1);
		
	String vanitha =new String("vanitha");
	String internvanitha=vanitha.intern();
	
	System.out.println(vanitha==internvanitha);
	
	String vani= "vanitha";
	System.out.println(internvanitha==vani);
	
	
	name1="bhoomika";
	System.out.println(name==name1);
	
	String vanitha1=new String("vanitha");
	System.out.println(vanitha==vanitha1);
	}

}
