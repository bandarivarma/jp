/*single interface has multiple implementation classes *//* yes single interface has multiple implementation classes is possible*/

interface X
{
	public void walk1();
}

class Y implements X
{
	public void walk1()
	{
		System.out.println("go home");
	
	}

}
class Z implements X
{
	public void walk1()
	{
		System.out.println("walk away");
	
	}

}
class  MainXYZ_5
{
	public static void main(String[] args) 
	{
		Y y = new Y();
		y.walk1();
		Z z = new Z();
		z.walk1();
		
	}
}
