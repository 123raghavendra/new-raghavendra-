package oops.Array.SimpleProgram;

public class ArrayDemo {
	public static void main(String[] args) {
		
//declaration
        int[] arr=new int[4];
		//initalization of value     steps for write arry 
       //arr[0]=1                    1]Declaration
        //arr[1]=2                   2]institation
        //arr[2]=3                   3] instilization
        //arr[3]=4
         //or 
		 int num=1;
		for(int i=0; i<arr.length;i++ ) {
			arr[i]=num;
			num++;
		}
		for (int i=0; i<arr.length;i++) {	
		System.out.println(arr[i]);
	}
	}
}
	
