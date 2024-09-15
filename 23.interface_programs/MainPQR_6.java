/* multiple interface has single implementation class /* /* yes it is possible */

interface P
{
	public void move1();
}
interface Q
{
	public void move2();
}
interface R
{
	public void move3();
}

class S implements P,Q,R
{
	public void move1()
	{
	System.out.println("move 2000km");
	}
	public void move2()
	{
	System.out.println("move 3000km");
	}
	public void move3()
	{
	System.out.println("move 4000km");
	}
}

class  MainPQR_6
{
	public static void main(String[] args) 
	{
		S s = new S();
		s.move1();
		s.move2();
		s.move3();
	}
}
