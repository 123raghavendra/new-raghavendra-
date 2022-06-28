package oops.MethodsOfObjectClass.ProtectedObjectClone;

public class Soap implements Cloneable {
String Brand;
double Price;
String Colour;

public Soap(String Brand,double Price,String Colour) {
	this.Brand=Brand;
	this.Price=Price;
	this.Colour=Colour;
}
	
	public Soap Clone() throws CloneNotSupportedException{
		
		Object obj=super.clone();
		Soap soap=(Soap)obj;
		return soap;	
	
}

@Override
public String toString() {
	return "Soap [Brand=" + Brand + ", Price=" + Price + ", Colour=" + Colour + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	
	
}
}

