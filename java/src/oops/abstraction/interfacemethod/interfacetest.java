package oops.abstraction.interfacemethod;


public class interfacetest {
	
		public static void main (String[] args){
			computer computer =new computer();
			sony sony =new sony();
			Epson epson =new Epson();
			computer.slot(epson);
			computer.slot(sony);
			
		}

}
