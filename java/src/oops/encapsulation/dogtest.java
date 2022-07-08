package oops.encapsulation;

public class dogtest {
	public static void main(String[] args) {
		dog dog =new dog();
			dog.setName("kulfi");
			dog.setColour("black");
			dog.setBread("german");
			dog.setAge(2);
			dog.setPrice(20000.00);
		
		System.out.println("name"+dog.getName());
		System.out.println("colour"+dog.getColour());
		System.out.println("Bread"+dog.getBread());
		System.out.println("age"+dog.getAge());
		System.out.println("price"+dog.getPrice());
		
	} 

}
