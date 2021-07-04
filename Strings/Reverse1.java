package com.Programming;

public class Reverse {

	public static void main(String[] args) {
		String s1 = "i love java";
	
		System.out.println("--------Reversing the words-------");
	String str[] = s1.split(" ");
	
	
	
	for(int i = str.length-1; i>=0 ; i--)
	{
		System.out.println(str[i]);
	}

	
//	System.out.println("----- Reversing the character ------");
//	String res ="";
//	for(int i = str.length-1; i>=0; i--)
//	{
//		String s = str[i];
//		for(int j = s.length()-1; j>=0; j--)
//		{
//			res = res + s.charAt(j);
//		}
//		
//		res = res + "";
//	}
//	System.out.println(res);
	}

}
