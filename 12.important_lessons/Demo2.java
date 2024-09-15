class Demo2			//lesson 2 : with in the same class, static method can call another method directly
					//becoz both methods are present in the same static pool area.
{	
	public static void walk()
	{
		System.out.println("verma");	
	}

	public static void go()
	{
		walk();
		System.out.println("ramesh");	
	}
	public static void main(String[] args) 
	{
		go();
	}
}
