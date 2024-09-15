/* wap to create 2 methods
method 1: static method with two integer local variable, perform addition and return the results.
method 2: non static method with 2 double local variable,perform subtration and return the results...
call all the methods from the main method, receive the output from the method and perform multiplication
using the output nd print the multiplication output ? */

class Test2	
{
	public static int add()
	{
		int a = 2;
		int b = 4;
		int c = a+b;
		return c;
	}
	public double sub()
	{
		double a = 1.4;
		double b = 1.4;
		double c = a-b;
		return c;
	}
	public static void main(String[] args) 
	{
		int d = add();
		Test2 obj = new Test2();
		double e = obj.sub();
		double finalResult = d*e;
		System.out.println(finalResult); 



	}
}		
