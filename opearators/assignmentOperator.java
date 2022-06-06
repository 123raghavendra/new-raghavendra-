class assignmentOperator {
	static int sum(int x, int y) {
       return x+y;
   }

    public static void main (String[] args) {
       int a = 2; 
       int b = a; 	
       int c = a + b;
       int d = sum(a,b);
       boolean e = a>b;
       System.out.println("a = " + a);
       System.out.println("b = " + b);
       System.out.println("c = " + c);
       System.out.println("d = " + d);
       System.out.println("e = " + e);
    
    }    
 
   }
  