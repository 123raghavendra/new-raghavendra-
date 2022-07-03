package oops.Array.SingleDimensionalArray;

public class SingleArray {
	public static void main(String[] args) {
		
		
		int[] number= {1,2,3,4,5};
		
		     	 int num=1;
				for(int i=0; i<number.length;i++ ) {
					number[i]=num;
					num++;
				}
				for (int i=0; i<number.length;i++) {	
				System.out.println(number[i]);
			}
	}

}
