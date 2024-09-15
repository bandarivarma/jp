class Rectangle6 
{
	public int l;//-------->>>non static variable present in an object.
	public double w;
	
	public Rectangle6(int l, double w)//----->>>in this l and w are not non static variables, they are arguments.
	{
		this.l = l; //--->>here values in an arguments are goes to non static variables present in an object
		this.w = w;
	}

	public void walk()
	{
	   	double area = this.l*this.w;
		System.out.println("rectangle of demensions "+this.l+" x "+this.  w+" is "+area);
	}
	public static void main(String[] args) 
	{
		Rectangle6 r1 = new Rectangle6(2,2.1);
		Rectangle6 r2 = new Rectangle6(3,2.2);
		Rectangle6 r3 = new Rectangle6(4,2.3);
		r1.walk();
		r2.walk();
		r3.walk();
	}//above program is according to imp lessons...but this is actual way
}
