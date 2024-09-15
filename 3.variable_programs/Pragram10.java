/* wap to create 2 static and 2 non static variables of data type of your choice, access to print in main method? */

class Pragram10 
{
	public static String name = "verma";
	public static char alpha = 'a';
	public int a = 33;
	public double height = 3.3;

	public static void main(String[] args) 
	{
		System.out.println(name);
		System.out.println(alpha);
		Pragram10 obj = new Pragram10();
		System.out.println(obj.a);
		System.out.println(obj.height);

	}
}
