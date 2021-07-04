class ThisMethod
{
	int a = 10;
	public void run()
	{
		System.out.println(this.a);
		System.out.println("in run");
		//wish();
		this.wish();
	}

	public void wish()
	{
		System.out.println("in wish");
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		ThisMethod t = new ThisMethod();
		t.run();
	}
}