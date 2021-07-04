class NonStatic
{
	int i = 10;
	int k = 20;
	public  void add()
	{
		int c = i + k;
		System.out.println("Sum is:" + c);

	}
	public static void main(String[] args)
	{
		NonStatic n = new NonStatic();
		 n.add();
		 System.out.println(n.i);
	}

}