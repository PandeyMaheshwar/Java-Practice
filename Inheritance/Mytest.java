class Vehicle
{
	String gear = "Gear";
	String speed ="Speedometer";
	int registration_no;
	public void common()
	{
		System.out.println("All vehicles have"+ gear+"&"+speed);
	}
}
	class Bike extends Vehicle
	{   
		int wheels = 2;
		Bike(int registration_no)
		{
			this.registration_no = registration_no;
		}

		public void two_wheeler()
		{
			System.out.println("Bike has"+wheels+"wheels");
			System.out.println("Registration_no :" + registration_no);
		}
	}

	class Mytest
	    {
		public static void main(String[] args) {
		Bike b = new Bike(12);

		b.common();
		b.two_wheeler();
			
		}
	 }
    