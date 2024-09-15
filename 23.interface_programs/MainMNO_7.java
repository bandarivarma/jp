/* multiple interface inherited to single interface *//*yes it is possible */
interface M
{
	public void work1();
}
interface N 
{
	public void work2();
}
interface O
{
	public void work3();
}

interface P extends M,N,O
{
	
}
class S implements P
{
	public void work1()
	{
	 System.out.println("work up to 1pm");
	}
	public void work2()
	{
	 System.out.println("work up to 2pm");
	}
	public void work3()
	{
	 System.out.println("work up to 3pm");
	}
}

class MainMNO_7 
{
	public static void main(String[] args) 
	{
		S s = new S();
		s.work1();
		s.work2();
		s.work3();
	}
}
