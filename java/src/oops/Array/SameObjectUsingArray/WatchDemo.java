package oops.Array.SameObjectUsingArray;

public class WatchDemo {
	public static void main(String[] args) {

	Watch Titan=new Watch("Titan","White",1500.00);
	Watch Sonata=new Watch("Sonata","Gold",1000.00);
	Watch Fastrack=new Watch("Fastrack","Silver",800.00);
	Watch Tata=new Watch("Tata","Black",500.00);
	Watch Rolex=new Watch("Rolex","Blue",2000.00);
	Watch Omega=new Watch("Omega","Red",1300.00);

	Watch[]Watches= {Titan,Sonata,Fastrack,Tata,Rolex,Omega};
	for(int i=0;i<Watches.length;i++) {
     System.out.println(Watches[i]);
	
	
}
}
}