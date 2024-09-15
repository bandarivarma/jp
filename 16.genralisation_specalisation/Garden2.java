class Garden2				//here we did with non static method by using again with flower,rose,lilly,jasmine
{									
	public  void pull(Rose r)
	{
		r.attracts();
		r.propose();
	}
	public  void cut(Lilly l)
	{
		l.attracts();
		l.decorate();
	}
	public  void pluck(Jasmine j)
	{
		j.attracts();
		j.pooja();
	}
	public  void plant(Flower f)
	{
		f.attracts();
		
		if(f instanceof Rose)//instanceof means objectof
		{
			Rose r = (Rose)f;
			r.propose();
		}
		else if(f instanceof Lilly)
		{
		  Lilly l =(Lilly)f;
		  l.decorate();
		}
		else if(f instanceof Jasmine)
		{
			Jasmine j = (Jasmine)f;
			j.pooja();
		}
		else
		{
			System.out.println("invalid object");
		}

	}
}


