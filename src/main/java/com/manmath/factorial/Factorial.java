package com.manmath.factorial;

public class Factorial {

	public static int factorial(int n){
		if(n==0) return 1;
		return n*factorial(n-1);
	}
	public static int factorialDynamic(int n){
		int[] factArr = new int[n+1];
		factArr[0] = 1;
		for(int i = 1; i <= n; i++) {
			factArr[i] = i * factArr[i-1];
		}
		return factArr[n];
	}
	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(factorialDynamic(4));
	}

}
