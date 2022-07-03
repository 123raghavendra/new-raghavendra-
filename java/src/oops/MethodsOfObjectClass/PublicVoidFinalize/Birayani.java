package oops.MethodsOfObjectClass.PublicVoidFinalize;

public class Birayani {
	String Brand;
	double price;
	
	
	
public Birayani(String brand, double price) {
		super();
		Brand = brand;
		this.price = price;
	}

//	Birayani(String Brand,double price){
//		this.Brand=Brand;
//		this.price=price;
//		}
	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize method called");
	}

//	@Override
//	public String toString() {
//		return "Birayani [Brand=" + Brand + ", price=" + price + "]";
//	}
//	

}
