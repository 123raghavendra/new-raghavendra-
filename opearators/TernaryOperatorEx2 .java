 class TernaryOperatorEx2{  
public static void main(String args[]){  
int x, y;  
x = 20;  
y = (x == 1) ? 61: 90;  
System.out.println("Value of y is: " +  y);  
y = (x == 20) ? 61: 90;  
System.out.println("Value of y is: " + y);  
}  
}  


here x&y two operands are here in 1st condition (x==1) is false so its going to execute the value of y= 90.
and 2nd condition (x==20) is true soo its execute the value of x=61.

output:
value of y is:90
value of y is :61