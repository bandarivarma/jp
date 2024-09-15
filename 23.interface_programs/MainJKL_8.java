/* single class inherits from superclass as well as implements interface *//*yes it is possible*/

interface J
{
	public void jump();
}
class K
{
	public void getUp()
	{
		System.out.println("getup early ");

	}
}
class L extends K implements J
{
	public void jump()
	{
		System.out.println("jump 5m away ");
	
	}

}
class  MainJKL_8
{
	public static void main(String[] args) 
	{
		L l = new L();
		l.jump();
		l.getUp();
	}
}
