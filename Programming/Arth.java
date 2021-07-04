class Arth
{
	public static void main(String [] args)
	{
	int a = 10;
	int b = 2; 
	//int result;
	int add, sub, div, mul, mod;

	/*switch(result)
		{
		case 1: result = a+b;
		System.out.println("Addition is:" + result);
		
		case 2: result = a-b;
		System.out.println("Subtraction is:" + result);
		
		case 3: result = a*b;
		System.out.println("Multiplication is:" + result);
		
		case 4: result = a/b;
		System.out.println("Division is:" + result);
		break;
		default : ("invalid");
		
		}*/

	add = a+b;
	sub = a-b;
	div = a/b;
	mul = a*b;
	mod =a%b;
	System.out.println("Addition is:" + add);
	System.out.println("Subtraction is:" + sub);
	System.out.println("Multiplication is:" + mul);
	System.out.println("Division is:" + div);
	System.out.println("Modulus is:" + mod);
		
	}
}