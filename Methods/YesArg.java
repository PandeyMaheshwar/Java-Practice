class YesArg
{
	public static int add(int i, int j)
	{
		//System.out.println(i+","+j);
		int c = i + j;
		return c;
	}
	public static void main(String [] args)
	{
		 int num =12;
		 int num2 = 10;
		 YesArg obj = new YesArg();
		 int result = obj.add(num,num2);
		 System.out.println(result);
	}
	
}