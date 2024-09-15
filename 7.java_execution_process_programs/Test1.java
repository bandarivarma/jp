/* wap to create static variable,non static varibable , local variable 
and print all the variable in the main method? */

class  Test1
{
	public static int i = 78;
	public double z = 3.2;

	public static void main(String[] args)  // note :static & non static varibles are global variables located in heap area
	{										// note : local variables are located in stack area
		int k = 2;
		System.out.println(i);
		System.out.println(k);				//process with stack area and heap area diagrams are in notes..check it
		Test1 ti = new Test1();
		System.out.println(ti.z);

	}
}
