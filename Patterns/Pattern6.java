class Pattern6
{
 public static void main(String[] args)
 { 
 	int n= 1;
 	int temp;
 	
 	for(int i =1; i<=5; i++)
 	{
 		temp = n;
 		for(int j= 1; j<=i; j++)
 		{
 		 
 			
 			System.out.print(temp+" ");
 			temp+=2;
 		}
 		n+=2;
 		System.out.println();
 	}
 }
}


