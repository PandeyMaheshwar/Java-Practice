package com.Programming;

public class TrimSplit {

	public static void main(String[] args) {
		String s1 = "  All Engineers are boon to society";
		System.out.println(s1);

		System.out.println(s1.trim());   // trim only remove beginning and ending spaces
		
		
		System.out.println("------------------------");
		
		String[] s2 = s1.split("  ");          //split("")  with the space; 
		for(int i = 0; i<s2.length; i++)
		{
			System.out.println(s2[i]);
		}
		
		
	}

}


