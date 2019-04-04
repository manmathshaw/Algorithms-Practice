package com.manmath.dynamic;

public class LongestComSubSequence {

	public static void main(String[] args) {
		String str1 = "ABCDEFHI";
		String str2 = "BDGIKLMNOP";
		int result = LongestComSubSequence.findLongestSub(str1, str2);
		System.out.println("longest subsequence::"+result);

	}

	private static int findLongestSub(String s1, String s2){
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		
		int count=0;
	
		for(int i=0; i<sb1.length();i++){
			for(int j=0;j<sb2.length();j++){
				if(sb1.charAt(i)== sb2.charAt(j)){
					sb2.deleteCharAt(j);
					count++;
					break;
				}
				
			}
		}
		return count;
	}

}
