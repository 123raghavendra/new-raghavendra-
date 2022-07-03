package oops.Array.JaggedArrayForDifferentValues;

public class JaggedArray {
public static void main(String[] args) {
	int[][] JaggedArray= {{1,2},{3,4,5},{6,7,8,9}};
	
	int num=1;
	for(int i=0;i<JaggedArray.length;i++) {
	for(int j=0;j<JaggedArray[i].length;j++) {
		JaggedArray[i][j]=num;
		num++;
		}
	    }

	for(int i=0;i<JaggedArray.length;i++) {
	for(int j=0;j<JaggedArray[i].length;j++) {
		System.out.print(JaggedArray[i][j]+" ");
	}		
		System.out.println();
		
	
	
	

	}
	}
}
