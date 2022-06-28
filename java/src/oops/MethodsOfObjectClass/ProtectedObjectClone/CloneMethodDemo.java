package oops.MethodsOfObjectClass.ProtectedObjectClone;

public class CloneMethodDemo {

	public static void main(String[] args) {
		Soap santoor =new Soap("Santoor",10.00,"Orange");
		
		Soap copyofSantoor=null;
				
				try {
					copyofSantoor=santoor.Clone();
				}
	
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	System.out.println(santoor == copyofSantoor);
	System.out.println(santoor);
	System.out.println(copyofSantoor);
	
	
	}
}
