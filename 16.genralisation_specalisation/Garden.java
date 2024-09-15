class Garden
{
	public static void pull(Rose r)
	{
		r.attracts();
		r.propose();
	}
	public static void cut(Lilly l)
	{
		l.attracts();
		l.decorate();
	}
	public static void pluck(Jasmine j)
	{
		j.attracts();
		j.pooja();
	}
	public static void plant(Flower f)
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

