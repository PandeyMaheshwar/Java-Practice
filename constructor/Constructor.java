class Constructor
{
	int i;
	double d;
	Constructor(int i, double d)
	{
		this.i = i;
		this.d = d;
	}
	public static void main(String[] args)
	{
		Constructor c = new Constructor(1, 10.5);
		System.out.println(c.i+","+c.d);
	}
}