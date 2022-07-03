package oops.Array.SameObjectUsingArray;

public class Lipstick {
	
	String Brand;
	String Colour;
	Double Price;
	
	Lipstick(	String Brand,String Colour,Double Price){
		this.Brand=Brand;
		this.Colour=Colour;
		this.Price=Price;
		
		
	}

	@Override
	public String toString() {
		return "Lipstick [Brand=" + Brand + ", Colour=" + Colour + ", Price=" + Price + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
