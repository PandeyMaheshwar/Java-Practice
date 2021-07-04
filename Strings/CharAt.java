package com.Programming;

public class CharAt {

	public static void main(String[] args) {
		
		String s1 = "malayalam";
		System.out.println(s1.charAt(2));  //Char no start with 1
		
		System.out.println("-------------------------");
		
		// Check for Palindrome
		
		System.out.println(s1.length());
		
		String res = "";
		
		for(int i=s1.length()-1; i>=0; i-- )
		{
		   res = res + s1.charAt(i);
		}
		
		System.out.println(res);
		
		if(res.equals(s1))
		{
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println("Not a Pallindrome");
		}

	}
}
