class SuperStmt
{
	SuperStmt()
	{
		System.out.println("!");
	}

	SuperStmt(int i)
	{	
		System.out.println("@@");
	}
	SuperStmt(double d)
	{	this(10);
		System.out.println("$$$");
	}
}

class Sample extends SuperStmt
{
	Sample()
	{	super(1.5);
		System.out.println("%%%%");
	}

	Sample(int i)
	{	this();
		System.out.println("^^^^");
	}

	public static void main(String[] args) {
		Sample s = new Sample(1);
	}
}