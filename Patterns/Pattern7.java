class Pattern2
{
	public static void main(String[] args)
	{
		
		int temp;
		for(int i=1;i<=5;i++)
		{
			temp=i;
			for(int j=1; j<=i;j++)
			{
				System.out.print(temp+" ");
				temp+=i;
			}
			
			System.out.println();	
		}
	}

}