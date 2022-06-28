package oops.MethodsOfObjectClass.PublicBooleanEquals;

public class EqualsMethodDemo {
	public static void main(String[] args) {
		Ac lg=new Ac("LG","WHITE",30000.00);
		Ac Samsung=new Ac("SAMSUNG","BLACK",33000.00);
		Ac Lg1=new Ac("SAMSUNG","BLACK",33000.00);
		System.out.println(lg==Samsung);
		System.out.println(lg==Lg1);
		System.out.println(Lg1==Samsung);
		System.out.println(lg.equals(Lg1));
	
	
	}
	
	

}
