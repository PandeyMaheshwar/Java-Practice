class Music
{
	String name;
	String title;
	int views;
	Music(String title, String name)
	{
	this.name = name;
	this.title = title;
	}
	Music(String title, String name, int views)
	{
	this.name = name;
	this.title = title;
	this.views = views;
	}
	public static void main(String[] args)
	{
	Music a  = new Music("Tere Bin", "Jubin");
	System.out.println(a.name+"  "+a.title);
	Music b  = new Music("Tere Bin", "Jubin", 100);
	System.out.println(b.name+"  "+b.title+" "+b.views);
	}
}