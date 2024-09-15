//Blue print for the rectangle

class Rectangle2																//QUE :
{																				//blue print for the rectangle 
	public int l;																//int
	public double b;															//double
																				//print area(): void
	public void printArea()														//main  method													
	{
		double area = l*b;
		System.out.println("rectangle of demensions "+l+" x "+b+" is "+area);
	}
	public static void main(String[] args) 
	{
	 Rectangle2 r1 = new Rectangle2();
	 Rectangle2 r2 = new Rectangle2();
	 Rectangle2 r3 = new Rectangle2();
		r1.l=1;
		r1.b=2.2;
		r2.l=2;
		r2.b=2.2;
		r3.l=3;
		r3.b=2.2;
		r1.printArea();
		r2.printArea();
		r3.printArea();
	}
}
