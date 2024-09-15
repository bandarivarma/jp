class Demo

{
	public static void move(int a)
	{
		System.out.println(a);
	}
	
	public static void move(String c)
	{
		System.out.println(c);
	}
	
	public static void move(int a,char c)
	{
		System.out.println("number "+a+" is similar to "+c );
	}
	public static void main(String[] args) 
	{
		move(2);
		move("veerrr");
		move(2,'5');
	}
}
