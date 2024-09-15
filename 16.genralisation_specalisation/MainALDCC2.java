class MainALDCC2 
{
	public static void main(String[] args) 
	{
		Circus2 c2 = new Circus2();
		c2.zoo(new Lion());
		c2.home(new Dog());
		c2.wall(new Cat());
		System.out.println();
		c2.forest(new Lion());
		c2.forest(new Dog());
		c2.forest(new Cat());

	}
}
