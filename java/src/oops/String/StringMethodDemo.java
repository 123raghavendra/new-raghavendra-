package oops.String;

public class StringMethodDemo {
	public static void main(String[] args) {
		String name="nandish";
		String upperCaseName =name.toUpperCase();
		
		System.out.println("name:"+name);
		System.out.println("to uppercase:"+name.toUpperCase());
		
		
		String Sirname="chanal";
		String cancatinatodName=name.concat(Sirname);
		
		System.out.println("cancatinatodName:"+cancatinatodName);
		
		System.out.println("char at 1 in name:"+name.charAt(3));
		
		System.out.println(cancatinatodName.endsWith("nal"));
		
		System.out.println(cancatinatodName.contains("chanal"));
		
		String[] spilttedstr=cancatinatodName.split(" ");
		 
		System.out.println("words in cancatinatodName:"+spilttedstr.length);
		
		
		
		
	}
	
	

}
