class Tri_13 extends Shape 
{
	public double b;
	public double h;

	public Tri_13(double b,double h)
	{
		this.b = b;
		this.h = h;
	}
	public void findArea()
	{
		double area = 0.5*this.b*this.h;
		System.out.println("area of the Tri is "+area);
	
	}
}
