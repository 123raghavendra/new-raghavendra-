package oops.MethodsOfObjectClass.PublicVoidFinalize;

public class BirayaniDemo {
	public static void main(String[] args) {
		
	
	Birayani birayani =new Birayani ("Niyaz",100.00);
	birayani=null;
    System.gc();
    System.out.println(birayani);



}

}
