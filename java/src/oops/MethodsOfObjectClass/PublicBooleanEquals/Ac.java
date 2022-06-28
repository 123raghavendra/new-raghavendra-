package oops.MethodsOfObjectClass.PublicBooleanEquals;

import java.util.Objects;

public class Ac {
	String Brand;
	String Colour;
	double Price;
	
	Ac(String Brand,String Colour,double Price){
		this.Brand=Brand;
		this.Colour=Colour;
		this.Price=Price;
		
		
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(Brand, Colour, Price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ac other = (Ac) obj;
		return Objects.equals(Brand, other.Brand) && Objects.equals(Colour, other.Colour)
				&& Double.doubleToLongBits(Price) == Double.doubleToLongBits(other.Price);
	}
	

}
