class logicaloperator1{
public static void main (String[] args){
int a=5;
int b=8;
//&& operator
System.out.println((5>3)&&(8>5));
System.out.println((5>3)&&(8<5));	
	// || or operator 
	System.out.println((5<3)||(8>5));
	System.out.println((5>3)||(8<5));
	System.out.println((5<3)||(8<5));
    // ! not operator
    System.out.println(!(5==3));
	System.out.println(!(5>3));
}
}