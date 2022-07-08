package WrapperClass.UnBoxing;

public class UnBoxingDemo {
	public static void main(String[] args) {
		
	//	implicit unboxing
		Integer i= new Integer(100);
		int j=i;
		System.out.println("i:"+i);
		System.out.println("j:"+j);
		
		
		//explicit unboxing
	Integer k=new Integer(200);
	int l=k.intValue();
	System.out.println("k:"+k);
	System.out.println("l:"+l);
	
	}
	

}
