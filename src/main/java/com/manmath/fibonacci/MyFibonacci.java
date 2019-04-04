/**
 * 
 */
package com.manmath.fibonacci;

/**
 * @author manmathshaw
 *
 */
public class MyFibonacci {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(fibonaci(3));
	}
	private static int fibonaci(int n){
		int[] fib = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2; i <= n; i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		return fib[n];
	}

}
