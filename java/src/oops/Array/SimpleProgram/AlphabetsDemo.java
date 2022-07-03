package oops.Array.SimpleProgram;

public class AlphabetsDemo {
	public static void main(String[] args) {
		
	char[] arr=new char[26];
	char alphabet='A';
	for (int i=0;i<arr.length;i++) {
		arr[i]=alphabet;
		alphabet++;
		System.out.println(arr[i]);
	}
	
	
	
	

	}
}
