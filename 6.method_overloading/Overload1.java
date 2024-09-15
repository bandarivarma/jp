/* wap to over load static and non static method? */

class  Overload1
{
	public static void move(int a)
	{
		System.out.println(a);
	}
	
	public void move(double b)
	{
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		move(2);
		Overload1 obj = new Overload1();
		obj.move(2.3);
	}
}
