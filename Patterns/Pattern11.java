class Pattern1 
{
	public static void main(String[] args) {
		int num=2;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{	
						boolean ch=true;
						while(ch)
						{
							int count=0;
							for(int k=2;k<num;k++)
							{
								if(num%k==0)
								{
									count++;
									break;
								}
						}
						if(count==0)
						{
							System.out.print(num+"\t");
							ch=false;

						}
						num++;
						}
				

				
				
			}
			System.out.println();
		}
	}
	
}