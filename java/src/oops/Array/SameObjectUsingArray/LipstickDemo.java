package oops.Array.SameObjectUsingArray;

public class LipstickDemo {
	public static void main(String[] args) {
		Lipstick Lakme=new Lipstick("Lakme","black",10.00);
		Lipstick mac=new Lipstick("mac","pink",5.00);
		Lipstick myglam=new Lipstick("myglam","green",1.00);
		Lipstick maybeline=new Lipstick("maybeline","red",3.00);
		Lipstick sugar=new Lipstick("sugar","yellow",350.00);
		
		Lipstick[] lipsticks= {Lakme,mac,myglam,maybeline,sugar};
		for(int i=0;i<lipsticks.length;i++) {
		//if(lipsticks[i].Price<10) {
		
			System.out.println(lipsticks[i]);
		}
		
	}
	}

