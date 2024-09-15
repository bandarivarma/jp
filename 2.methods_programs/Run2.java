/* write to create two methods and call the methods from the main method*/

class Run2
{
	
	public static void move()
	{
		System.out.println("move 5km...");
    }
	
	
	public static void swim()
	{
		System.out.println("swim across the river...");
	}
	
	
	public static void main(String[]args)
	{
		System.out.println("main starts..");
		move();
		swim();
		System.out.println("main ends...");
	}
}
