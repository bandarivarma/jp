/* wap to create 1 static variable, 1 nonstatic variable, 1 static method with local variable and print it,
1 non static method with local variable  and print it, call all the methods and access to print all the global
variable in main method */

class  Program12
{
	public static int a = 11;
	public int b = 22;
	
	public static void test1()
	{
		int c = 33;
		System.out.println(" varma marks in english "+c);
	}
	 public void test2()
	{
		int d = 44;
		System.out.println("varma marks in telugu "+d);
	}

	public static void main(String[] args) 
	{
	 System.out.println(" main starts...");
	 System.out.println("varma marks in maths "+a);
		Program12 obj = new Program12();
		System.out.println("varma marks in biology "+obj.b);
		test1();
		obj.test2();
	System.out.println("main ends...");
	}
}
