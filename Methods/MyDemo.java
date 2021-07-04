class MyDemo
{
	static double d = 12.5;
	static double a =10.3;
	int b = 10;
	public void sleep()
	{
		System.out.println(d);

	}
	public static void sub()
	{
		double c = d - a;
		MyDemo i = new MyDemo();
		System.out.println(i.b);
	}
	public static void main(String[] args)
	{
		MyDemo i = new MyDemo();
		i.sleep();
		sub();
		System.out.println("main ends");
	}
}