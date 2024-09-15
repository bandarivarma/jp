class Circus2 
{
	public void zoo(Lion l) 
	{
		l.hunt();
		l.move();
	}
	public void home(Dog d)
	{
		d.play();
		d.move();
	}
	public void wall(Cat c)
	{
		c.chase();
		c.move();
	}
	public void forest(Animal a)
	{
		a.move();
		
		if(a instanceof Lion)
		{
			Lion l = (Lion)a;
			l.hunt();
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
 
