/* wap to create 1 static variable and 1 non static variable of the same
data type, access to print in main method*/

class  Test8
{
	public static double height = 5.5;
	public double percentage = 6.5;

	public static void main(String[] args) 
	{
		System.out.println(height);
		Test8 obj = new Test8();
		System.out.println(obj.percentage);

	}
}
