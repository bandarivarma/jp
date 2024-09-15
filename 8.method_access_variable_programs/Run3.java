/* wap to create non static variable and print in the static method , call the static from the main method */

class  Run3
{
	public int k = 2; 

	public static void move()
	{
	Run3 obj = new Run3();
	System.out.println(obj.k);
	}
	public static void main(String[] args) 
	{		
		move();
	}
}
