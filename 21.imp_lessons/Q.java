class Q extends P
{
	public void test()
	{
		System.out.println("test bike");
	}

	public void display()
	{
		super.test();
		this.test();
		
	}
}
