/* wap to create static variable and print in non static method, callnon static method from the main method */
class  Run4
{
	public static int d = 4;

	public void move()
	{
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		Run4 t4 = new Run4();
		t4.move();
	}
}
