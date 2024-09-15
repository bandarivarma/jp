/* interface inherits interface */  /*  yes interface inherits interface is possible */

interface A
{
	public void test1();
}
interface B extends A
{
	public void test2();

}
class C implements B
{

	public void test1()
	{
		System.out.println("test car");
	}
	public void test2()
	{
		System.out.println("test bike");
	}

}

class  MainABC_4
{
	public static void main(String[] args) 
	{
		C c = new C();
		c.test1();
		c.test2();
	}
}
