
/* wap to perform multiplication in 4 different way? */

class  Overload4
{
	public static void multiply(int a,int b)
	{
		System.out.println(a*b);
	}
	public void multiply(double a,double b)
	{
		System.out.println(a*b);
	}
	public static double multiply(int a,int b,double c)
	{
		 return a*b*c;
	}
	public int multiply(int a,int b,int c )
	{
		return a*b*c;
	}
	public static void main(String[] args) 
	{
		multiply(3,4);
		Overload4 obj = new Overload4();
		obj.multiply(2.2,2.2);
		double result1 = multiply(2,2,2.2);
		System.out.println(result1);
		int result2 = obj.multiply(2,2,2);
		System.out.println(result2);

	}
}
