package oops.hasarelationship;

public class hasarelationshipAggragation {
	public static void main(String[] args) {
		
		library library=new library();
		library. student =new student();
		library. student.id="a01";
		library. student.name ="Rajakumar";
		library. student.branch ="EC";
		library. name="sharada";
		library.location="bengaluru";
		
		System.out.println("library name:"+library.  name);
		System.out.println("library location:"+library.location);
		System.out.println("library.student.name:"+library. student.name);
		System.out.println("library.student.branch:"+library. student.branch);
		System.out.println("library.student.id:"+library. student.id);
		
		
	}
}
		
		


