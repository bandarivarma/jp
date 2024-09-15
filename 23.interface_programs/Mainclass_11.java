/* steps to acheive abstraction using interface */
interface Sample
{
	public void move();
}
class Demo implements Sample
{
	public void move()
	{
		System.out.println("move method implemented");
	}

}
class Test //helper class..it is an independent class...Developer will design it
{
	public static Sample give()//helper method
	{
		Sample s = new Demo();//we can write this as--->return = new Demo();( Demo object or implementation class object is returned by upcasting it to Simple or interface)
		return s;
	}
}
class  Mainclass_11 //user Developer will use the program 
{
	public static void main(String[] args) 
	{
		Sample s1 = Test.give();
		s1.move();
	}
}
