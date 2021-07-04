package com.Programming;

public class ContainsOrEmpty {

	public static void main(String[] args) {
		String s1 = " ";
		String s2 = "";
		String s3  = "Match";
		String s4 = "tc";
		
		
	System.out.println(s1.isEmpty()); //  Check String is Empty or not
	System.out.println(s2.isEmpty());
	
	System.out.println("--------------");
	
	System.out.println(s3.contains("t"));
	System.out.println(s3.contains("Mat")); // Check the value contains or not
	System.out.println(s4.contains("t"));

	System.out.println("------------------------");
	
	System.out.println(s3.toUpperCase());  // Upper Case
	System.out.println(s3.toLowerCase());  // Lower Case
	System.out.println(s4.toUpperCase());
	}

}
