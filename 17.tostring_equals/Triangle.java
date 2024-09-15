class Triangle 
{
	public int base;
	public double height;
	
	public Triangle(int base,double height)
	{
		this.base = base;
		this.height = height;
	}
	
	 public double getArea()
	{
		return (0.5*this.base*this.height);	
	}

	public String toString()
	{
		return "area of the triangle "+this.getArea();
	}

	public boolean equals(Object obj)
	{
		if (obj instanceof Triangle)
		{
			Triangle triangle = (Triangle)obj;
			return this.base == triangle.base && this.height == triangle.height;
		}
		else
		{
			return false; 
		}
	}
}


