/*wap to create static method and nonstatic method and call the method in the main method ? */

class  Test2
{
	public static void move() 
	{
		System.out.println("Hello World1");
	}
	public void walk()
	{
		System.out.println("Hello World2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts....");
		move();
		Test2 t2 = new Test2();
		t2.walk();
		System.out.println("main ends...");
	}
}

/* note :1) method will enter in to stack area for execution
		 2)jvm will go to method and execute the method
		 3)after method execution, method will automatically exit from the stack area */

		 //process with stack area and heap area diagrams are in notes..check it