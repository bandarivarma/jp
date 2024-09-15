class Mainfatherdaughter 
{
	public static void main(String[] args) 
	{
		Father f1 = (Father)new Daughter();
		f1.car();				
		System.out.println("=================")	;				// up to here it is called upcasting
		Daughter f2 = (Daughter)f1;
		f2.car();							//up to here from upcasting,it is called downcasting
	}
}
//if methods are overridden(means overriding), even after upcasting we get overridden output..