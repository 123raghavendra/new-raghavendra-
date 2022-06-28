package oops.MethodsOfObjectClass.PublicFinalClassGet;

public class MobileDemo {
	public static void main(String[] args) {
		Mobile Mobile=new Mobile("Samsung","black",10000.00);
		System.out.println(Mobile.getClass());
		System.out.println(Mobile.getClass().getSimpleName());
		
		
	}

}
