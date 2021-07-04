class Test
{
	//public static void main([] args String) error
	//public static void main(args[] String) error
	//public static void main(String args) // no CTE but RTE error
	//public static void main(String...arg) execute
	public static void main(String []args) //execute
	//public static void main(String args[]) execute
	//public static void main([] String args)   error
	
	{
	 int i = 10;
	 i + = 2;
          System.out.println(i);  //error
	
	}
}