class mainA1B1C1 
{
	public static void main(String[] args) 
	{
		 B1  b1 = new c1();//c1 to B1 upcasted
		System.out.println(b1.j);
		System.out.println(b1.i);
		A1 a1 = b1; //B1 to A1  upcasted
		System.out.println(a1.i);
		B1 b2 = (B1)a1; // A1 to B1 downcasted
		System.out.println(b2.j);
		System.out.println(b2.i);
		c1 c = (c1)b2;//B1 to c1 downcasted
		System.out.println(c.k);
		System.out.println(c.j);
		System.out.println(c.i);




	}
} 
