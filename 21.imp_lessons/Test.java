class Test // lesson 9 developing multiple constructers with different arguments is called construcor overloading
{
	public Test(int i)
	{
		System.out.println("in test method of int arg i : "+i);
	
	}

	public Test(double j)
	{
		System.out.println("in test method of int arg i : "+j);
	
	}

	public Test(String y, boolean z)
	{
		System.out.println("in test method of int arg i : "+y);
		System.out.println("in test method of int arg i : "+z);
	
	}

	public static void main(String[] args)
	{
		Test test1 = new Test("hi",true);
		Test test2 = new Test(67);
		Test test3 = new Test(8.9);

		
	}
}