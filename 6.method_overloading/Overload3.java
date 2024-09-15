/* wap to overload main method with nonstatic method*/

class  Overload3
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Overload3 obj = new Overload3();
		obj.main(3);
	}
	public void main(int a)
	{
		System.out.println(a);
	}
}
