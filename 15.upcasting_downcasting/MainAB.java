class MainAB 
{
	public static void main(String[] args) 
	{
		A a1= new B();//up to here.. it is called upcasting
		a1.go();		
		System.out.println("=================")	;
		B b1 = (B)a1;//up to here from upcasting, it is called downcasting
		b1.walk();
		b1.go();		
	}
}
