import java.util.Scanner;
class Count
{
	public static void main(String [] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("enter a no :");
	int num = s. nextInt();
	int count = 0;
	while(num>0)
	{
	count ++;
	num =num/ 10;
	}
	System.out.println(count);
	
}
}