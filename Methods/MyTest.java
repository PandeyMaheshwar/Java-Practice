class MyTest
{
	static int i = 10;
	int k = 11;
	public static void display()
	{
		System.out.println(i);
		MyTest m = new MyTest();
		System.out.println(m.k);


	}
	public static void main(String[] args)
	{
		display();
		Demo d = new Demo();
		System.out.println(d.i);

	}
}

class Demo
{
	int i = 10;

}