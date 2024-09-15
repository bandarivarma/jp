/* wap to create 3 methods
method 1 : static method with 3 different datatype arguments, print all the arguments.
method 2 : non static method with 2 same datatype arguments, print all the arguments.
method 3 : static method with 1 arguments of any datatype, print all the arguments,....
call all the methods from the main method? */


class Test1 
{
	public static void move(int a,double b,char c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public void walk( String d,String e)
	{
		System.out.println(d);
		System.out.println(e);
	}

	public static void direct(boolean z)
	{
		System.out.println(z);
	}

	public static void main(String[] args) 
	{
		move(1,2.3,'a');
		Test1 obj = new Test1();
		obj.walk("verma","vineesh");
		direct(true);
	}
}
