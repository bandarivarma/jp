class  Circle_13 extends Shape
{
	public static double pi =5.6;
	public int r;

	public Circle_13(int r)
	{
		this.r = r;
	
	}
	public void findArea()
	{
		double area = pi*this.r*this.r;
		System.out.println("area of the circle is "+area);
	
	}
	
}
