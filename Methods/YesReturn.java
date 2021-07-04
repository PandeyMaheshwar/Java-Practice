class YesReturn
{
	public static int sleep()
	{
		System.out.println("in sleep");
		return 1;
	}
	public static void main(String [] args)
	{
		System.out.println("main");
		//System.out.println(sleep());
		int result = sleep();
		System.out.println(result);
	}
}