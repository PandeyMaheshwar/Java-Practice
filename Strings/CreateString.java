package com.Programming;

public class CreateString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String();
		s2 = "Python";
		String s3 = new String("adcf");
		char ch[] = {'a', 'd', 's'};
		String s4 = new String(ch);
		
		byte arr[] = {'1', '3', '4'};
		String s5 = new String(arr);
		System.out.println("-------------------");
		int len = s1.length();// length
		System.out.println(len);
		System.out.println("-------------------------");
		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
	}


