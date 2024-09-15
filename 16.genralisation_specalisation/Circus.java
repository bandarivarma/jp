class Circus 
{
	public static void zoo(Lion l) 
	{
		l.hunt();
		l.move();
	}
	public static void home(Dog d)
	{
		d.play();
		d.move();
	}
	public static void wall(Cat c)
	{
		c.chase();
		c.move();
	}
	public static void forest(Animal a)
	{
		a.move();
		
		if(a instanceof Lion)
		{
			Lion l = (Lion)a;
			l.hunt();
			a.move();
		}
		else if(a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.play();
		}
		else if(a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.chase();
		}
		else
		{
			System.out.println("invalid object");
		}

	}
}
