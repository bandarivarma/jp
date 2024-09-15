/* wap to create static variable and print in static method. call static method from main method.*/

class  Run1
{
	public static int k = 99;

	public static void move()
	{
		System.out.println(k);
	}
	public static void main(String[] args) 
	{
		move();
	}
}
