package oops.MethodsOfObjectClass.PublicStringToString;

public class Window {
	
	String type;
	double Height;
	double Width;
	
	Window( String type,double Height,double Width ){
	this.type=type;
	this.Height=Height;
	this.Width=Width;
	}

	@Override
	public String toString() {
		return "Window [type=" + type + ", Height=" + Height + ", Width=" + Width + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	
	}
	
	

}
