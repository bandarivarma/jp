class MainFRLJG2			//related to Garden2
{
	public static void main(String[] args) 
	{
		Garden2 g2 = new Garden2();
		g2.pull(new Rose());
		g2.cut(new Lilly());
		g2.pluck(new Jasmine());
		System.out.println();
		g2.plant(new Rose());
		g2.plant(new Lilly());
		g2.plant(new Jasmine());
	}
}
