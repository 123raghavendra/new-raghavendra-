package oops;

public class hasarelationship {
	
	
		public static void main (String [] args) {
			human human =new human();
			human.heart=new heart ();
			human.eyecolour="Green";
			human.lang="Kannada";
			human.location="Gadag";
			human.haircolour="Black";
			human.heart.btimes="72";
			human.heart.colour="Red";
			human.heart.pumpblood();
			human.heart.receiveblood();
			human.dark();
			human.see();
			
			System.out.println("The hair colour is:"+human.haircolour);
			System.out.println("The eye colour is:"+human.eyecolour);
			System.out.println("The speak language is:"+human.lang);
			System.out.println("The location is:"+human.location);
			System.out.println("The heart brats per min is:"+human.heart.btimes+"pm");
			System.out.println("The colour of heart is:"+human.heart.colour);
			
			
			
		}

	
}
