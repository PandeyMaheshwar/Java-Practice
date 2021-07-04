class MyClass
{
	static double d = 12.5;
	static double a =10.3;
	
	public void sleep()
	{
		System.out.println(d);
		System.out.println(a);
		sub();

	}
	public static void sub()
	{
		System.out.println("subpart");
	}

	public static void main(String[] args)
	{
		MyClass m = new MyClass();
		m.sleep();
		sub();
		System.out.println("main ends");
	}
}