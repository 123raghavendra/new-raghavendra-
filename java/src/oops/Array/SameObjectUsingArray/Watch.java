package oops.Array.SameObjectUsingArray;

public class Watch {
String Brand;
String Colour;
Double Price;

Watch(String Brand,String Colour,Double Price){
	this.Brand=Brand;
	this.Colour=Colour;
	this.Price=Price;
	
	
	
}

@Override
public String toString() {
	return "Watch [Brand=" + Brand + ", Colour=" + Colour + ", Price=" + Price + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}


}
