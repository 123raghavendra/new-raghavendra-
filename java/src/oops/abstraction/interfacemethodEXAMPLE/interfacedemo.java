package oops.abstraction.interfacemethodEXAMPLE;

public class interfacedemo {
	public static void main(String [] args) {
		Atm atm=new Atm();
		Bankofbarodacard bankofbarodacard =new Bankofbarodacard();
		 syndicatecard syndicatecard =new  syndicatecard();
		 atm.slot(syndicatecard );
		 atm.slot(bankofbarodacard);
	}

}
