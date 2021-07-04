class Static
{
	static int a = 10;
	static int d = 20;
	public static void sum()
	{
		int c = a + d;
		System.out.println(a);
		System.out.println(d);
		System.out.println("Sum is :" +c);
    }
		public static void main(String [] args)
		{
			sum();
		}

}