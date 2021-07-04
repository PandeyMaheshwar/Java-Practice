import java.util.Scanner;
class Max
{
	public static void main(String [] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("enter a no :");
	int num = s.nextInt();
	int max = 0;
	while(num>0)
	{
	int rem = num % 10;
	
	if(rem > max)
		max=rem;
	num/=10;
	
	}
	System.out.println(max);
	
}
}