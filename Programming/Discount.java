import java.util.Scanner;
class Discount
{
	public static void main(String [] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("enter a no :");
	int num = s. nextInt();
	int evenSum = 0;
	int oddSum = 0;
	while(num>0)
	{
	 int rem = num%10;
	if(rem % 2 == 0)
	 evenSum = evenSum + rem;
	else
	oddSum = oddSum + rem;
	num =num/ 10;
	}
	System.out.println(oddSum);
	System.out.println(evenSum);
	int discount = oddSum*evenSum;
	System.out.println(discount);
	
}
}