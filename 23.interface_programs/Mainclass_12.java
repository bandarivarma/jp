//steps to get abstraction by using abstract

abstract class A
{
	abstract public void move();
}
class B extends A
{
	public void move()
	{
		System.out.println("move method implementation");
	}

}
class Test //helper class..it is an independent class..independent means without inheritance...Developer will design it
{
	public static A give()//helper method
	{
		A a = new B();//we can write this as--->return = new B();( B object or implementation class object is returned by upcasting it to A or interface)
		return a;
	}
}
class  Mainclass_12 //user Developer will use the program 
{
	public static void main(String[] args) 
	{
		A a1 = Test.give();
		a1.move();
	}
}