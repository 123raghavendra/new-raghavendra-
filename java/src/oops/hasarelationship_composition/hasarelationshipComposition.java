package oops.hasarelationship_composition;

public class hasarelationshipComposition {
	
  	public static void main(String[] args) {
		
  		human human=new human();
  		heart heart =new heart();
  		human.eyecolour="black";
  		human.haircolour="black";
  		human.location="gadag";
  		human.lang="kannada";
  		human.heart.btimes="72";
  		human.heart.colour="red";
  		human.heart.pumpblood();
  		human.heart.receiveblood();
  		human.see();
  		human.dark();
  		
  		System.out.println("the hair colour is :+"human.haircolour);
  		
  		
  		System.out.println("the eye colour is :+"human.eyecolour);
  		
  		System.out.println("the location is :+"human.location);
  		
  		System.out.println("human talking language is :+"human.lang);
  	
  		
	}
				
		}		
			

		
	

	


