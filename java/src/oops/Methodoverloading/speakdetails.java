package oops.Methodoverloading;

public class speakdetails {
		public static void main (String[] args) {
			speak sp=new speak();
			friend friend =new friend();
			unknown unknown=new unknown();
			sp.talk(friend);
			sp.talk(unknown);
		}
	
	

}
