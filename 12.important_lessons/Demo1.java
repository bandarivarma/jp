class Demo1 
{ 
	public static int a = 12;
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo1();			//lesson 1 : here static members can be accessed through object
		System.out.println(d1.a);		// becoz every object has connection with  to static poor area
	}
}
