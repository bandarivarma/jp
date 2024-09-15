class Test1 //lesson 10 constructer calling another constructer is called constructer chaning
{
	public Test1(String z,int i)
	{	
		this(5.6);//calling same class constructer with double argument
		System.out.println("value of z "+z);
		System.out.println("value of i "+i);
		System.out.println();
	}

	public Test1(double a)
	{
		System.out.println("value of a "+a);
	}

	public static void main(String[] args) 
	{
		Test1 test1 = new Test1("hi",67);
	}
}
