class NoArg
{
	public static void run()
	{
		System.out.println("in run");
		return;
	}

	public static void main(String [] args)
	{
		System.out.println("Mains");
		run();
	}
}