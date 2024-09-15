/* wap to overload main with static method */

class  Overload2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		main(2);
	}
	public static void main(int a)
	{
		System.out.println(a);
	}
}
