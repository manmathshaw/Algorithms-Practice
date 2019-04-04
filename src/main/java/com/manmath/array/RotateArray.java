package com.manmath.array;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int k=2;
		int[] output = RotateArray.rotate(arr, k);
		for(int i=0; i<output.length; i++){
			System.out.print(output[i]);
			System.out.print(" ");
		}
	}
	
	private static int[] rotate(int[] arr, int k){
		int x = 0;
		int n = arr.length;
		int[] finalArr = new int[n];
		for(int i=n-k; i<n; i++){
			finalArr[x] = arr[i];
			x++;
		}
		for(int j=0; j<n-k; j++){
			finalArr[x] = arr[j];
			x++;
		}
		return finalArr;
	}

}
