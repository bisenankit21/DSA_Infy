package BruteForce;

public class Assignment1 {
	public static int[][] multiply(int arr1[][],int arr2[][]) {
		//Implement your logic here and change the return statement accordingly
		int c[][]=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=0;
				for(int k=0;k<2;k++) {
					c[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int arr1[][]=new int [][] {{2,4},{1,4}};
		int arr2[][]=new int [][] {{1,4},{1,3}};
		
		int[][] arr3=multiply(arr1,arr2);
		
		for(int index1=0;index1<arr3.length;index1++){
			for(int index2=0;index2<arr3.length;index2++){
				System.out.print(arr3[index1][index2]+" ");
			}
			System.out.println();
		}
	}

}
