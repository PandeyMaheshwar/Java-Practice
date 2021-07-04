class Check
{
	public static void main(String [] args)
	{
	//char c = 'A';
	char c = 'B	';
	/* if(c == 'a' || c=='e' || c=='i' ||c=='o' ||c=='u')

	System.out.println(c + " is vowel");
	
	else if(c == 'A' || c=='E' || c=='I' ||c=='O' ||c=='U')

	System.out.println(c + " is vowel");

	else
           System.out.println( c + "is consonant"); */


	switch(c)
	{
	case 'a' : System.out.println("vowel");
	break;
	case 'e' : System.out.println("vowel");
	break;
	case 'i' : System.out.println("vowel");
	break;
	case 'o' : System.out.println("vowel");
	break;
	case 'u' : System.out.println("vowel");
	break;
	case 'A' : System.out.println("vowel");
	break;
	case 'E' : System.out.println("vowel");
	break;
	case 'I' : System.out.println("vowel");
	break;
	case 'O' : System.out.println("vowel");
	break;
	case 'U' : System.out.println("vowel");
	break;
	default  : System.out.println("consonant");
	}

	} 
}