class Rect_13 extends Shape 
{
	public int l;
	public int w;

	public Rect_13(int l,int w)
	{
		this.l = l;
		this.w = w;
	}
	public void findArea()
	{
		int area = this.l*this.w;
		System.out.println("area of the Rect is "+area);
	
	}
}
