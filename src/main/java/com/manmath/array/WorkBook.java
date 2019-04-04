/**
 * 
 */
package com.manmath.array;

/**
 * @author Manmath
 *
 */
public class WorkBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 5};
		int k = 2;
		System.out.println(countMatch(arr, k));
	}
	
	private static int countMatch(int[] arr, int k){		
		int count=0;
		for(int i=0; i< arr.length; i++){
			if(arr[i] > k){				
				if(arr[i]/2!=0){
					count++;
				}
			}else{ 
				count=0;
			}
		}
		return count;
		
	}

}
