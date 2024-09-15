class V extends U
{
	public int i = 20;

	public void info()
	{
		int i = 30;
		System.out.println(i);//local variable
		System.out.println(this.i);//current object is subclass version variable
		System.out.println(super.i);//current object refer super class version variable
	}
} 
