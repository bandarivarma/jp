class Mainsample 
{
	public static void main(String[] args) 
	{
		Sample1 s1 = (Sample1)new Sample2();
		s1.hook();			//  up to here ... it is called upcasting....
		Sample2 s2 = (Sample2)s1;
		s2.roor();
		s2.hook();			// up to here from upcasting ...it is caled down casting...
	}
}
