/* wap to create 1 static variable, 1 nonstatic variable, 1 static method with local variable and print it,
1 non static method with local variable  and print it, call all the methods and access to print all the global
variable in main method */

class Program11

{	
	public static int a = 11;
	public int b = 22;
	
	public static void test1()
	{
		int c = 33;
		System.out.println(c);
	}
	 public void test2()
	{
		int d = 44;
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		Program11 obj = new Program11();
		System.out.println(obj.b);
		test1();
		obj.test2();


	}
}
