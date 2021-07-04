import java.util.Scanner;
class Reverse

{
  public static void main(String [] args)
	{
	
	Scanner s = new Scanner(System.in);
	System.out.println("enter a no : "); 	
	int n = s.nextInt();
	for(int i = n; i>= 1; i--)
	{
	System.out.println(i);
	}
    }
}