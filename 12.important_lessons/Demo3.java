class Demo3			//lesson 3: with in sameclass,nonstatic method can call another nonstatic method directly
					//becoz both methods are in the same object.
{
	public void go()
	{
		System.out.println("verma");
	}

	public void walk()
	{
		go();
		System.out.println("ramesh");
	}

	public static void main(String[] args) 
	{
		Demo3 d3 = new Demo3();
		d3.walk();
	}
}
