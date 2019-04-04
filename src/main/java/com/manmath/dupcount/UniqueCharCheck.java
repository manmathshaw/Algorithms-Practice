package com.manmath.dupcount;

public class UniqueCharCheck {

	public static boolean isUniqueChar(String str){

		if(str.length()>256){
			return false;
		}
		boolean[] myArr = new boolean[256];
		for(int i =0; i<str.length();i++){
			int val = str.charAt(i);
			if(myArr[val]){
				return false;
			}else{
				myArr[val]= true;

			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "aabc";
		System.out.println(UniqueCharCheck.isUniqueChar(str));
	}

}
