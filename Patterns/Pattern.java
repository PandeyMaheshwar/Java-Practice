class Pattern
{
	public static void main(String[] args) {
		int prev=0;
		int next=1;
		int sum=0;
		for (int i=1;i<=5 ;i++ ) 
		{
			for (int j=1;j<=i ;j++ ) 
			{
				if(i==1)
				{
					System.out.print(prev);
				}
				else if (i==2)
			    {
			    	System.out.print(next+"\t");
			    	sum=prev+next;
			    	System.out.print(sum+"\t");
				  	prev=next;
				  	next=sum;
				  	break;
				}
				else
				{
					sum=prev+next;
					System.out.print(sum+"\t");
					prev=next;
				  	next=sum;
				}
			}
			System.out.println();
			
		}
	}
}