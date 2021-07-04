package com.Programming;

public class ConcatSubstring {

	public static void main(String[] args) {
		String s1 = "Java ";
		String s2 = "is ";
		String s3 = "easy";
		System.out.println(s1.concat(s2).concat(s3));  //Concatenation
		System.out.println(s1+" "+s2+" "+s3);     
		
		System.out.println("------------------");
		
		String s4 = "Engineers are the gift for human kind";
		
		System.out.println(s4.substring(2, 10));  // Print part of Strings
		System.out.println(s4.substring(3));

	}

}
