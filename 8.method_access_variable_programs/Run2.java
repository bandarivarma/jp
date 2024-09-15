/*wap to create nonstatic variable and print in non static method...call non static from the main method ? */

class  Run2
{
	public int a = 10;
	
	public void move()
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
	 Run2 t2 = new Run2();
	 t2.move();
	}
}
