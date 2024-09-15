/* wap to create 1 static variable, 1 nonstatic variable, 1 static method with local variable and print it,
1 non static method with local variable  and print it, call all the methods and access to print all the global
variable in main method */

class  Program13
{
	
	public static int a = 11;						// global variable
	public int b = 22;								// global variable
	
	public static void test1()						    // test1 method with local variable
	{
		System.out.println("test1() starts");
		int c = 33;
		System.out.println(" varma marks in english "+c);
		System.out.println("test1() ends");
	}
	 public void test2()						        // test2 method with local variable
	{
		 System.out.println("test2() starts");
		int d = 44;
		System.out.println("varma marks in telugu "+d);
		System.out.println("test2() ends");
	}
	
	
	public static void main(String[] args)					// main method 
	{
		System.out.println(" main starts...");
	    System.out.println("varma marks in maths "+a);   // printing a
        Program13 obj = new Program13();				// creating an object to call non static local and global variable
		System.out.println("varma marks in biology "+obj.b);//print b
		test1(); // called test1
		obj.test2(); // called test2
		System.out.println("main ends...");
	}
}
