
package com.Programming;


public class EqualsIgnore {

	
	
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "Java";
		String s3 = "Python";
		String s4 = "java";
	
		System.out.println(s1.equals(s4));  // EQUALS
		System.out.println(s3.equals(s2));
		System.out.println(s1.equals(s2));
		
		System.out.println("-----------------");
		
		System.out.println(s1.equalsIgnoreCase(s2)); //Ignore Case Sensitive
		System.out.println(s3.equalsIgnoreCase(s2));
		
	}

}
