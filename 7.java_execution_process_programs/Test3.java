/* wap to create static variable, non static variable, static method, nonstatic method,
and access all the members in the main method */

class  Test3
{
	public static double a = 3.4;
	public int b = 12;


	public static void fly(int i ) 
	{	
		System.out.println("fly "+i+" kms");
	}
	public void jump(double p, char q)			//process with stack area and heap area diagrams are in notes..check it
	{
	System.out.println("in jump method p value : "+p);
	System.out.println("in jump method q value : "+q);
	}
	public static void main(String[] args)
	{
	System.out.println("main starts...");
	System.out.println(a);
	Test3  t3 = new Test3();
	System.out.println(t3.b);
	fly(89);
	t3.jump(4.5,'a');
	System.out.println("main ends...");
		}

}
