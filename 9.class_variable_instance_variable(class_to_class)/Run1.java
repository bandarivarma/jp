/* wap to create class variable, instance variable, 
staticmethod, non static method 
and access all the members in another class main method ? */

class  Run1
{									//note : global variable means static and non static variables
	public static int a = 22;		//note : class variable means static variable
	public int b = 33;				//note : instance variable means non static variable

	public static void move() 
	{
		System.out.println("Hello World 1");
	}
	public void walk()
	{
	System.out.println("Hello World 2");
	}
}
