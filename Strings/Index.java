package com.Programming;

public class Index {

	public static void main(String[] args) {
		String s1 = "malayalam";
		
		System.out.println(s1.indexOf('a'));  //give index no of only first found letter
		System.out.println(s1.indexOf('a', 3)); // overload if more repeating letter give index no greater than first letter
		
		
		String dup = "";
		for(int i = 0; i < s1.length(); i++)
		{
			if(dup.indexOf(s1.charAt(i))== -1)  // Check for duplicates
			{
				dup =dup +s1.charAt(i);         // Storing Duplicates
			}
			
			
		}
		
		System.out.println("Duplicates are :" + dup);
	}

}
