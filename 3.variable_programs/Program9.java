/* wap to create 1 static variable nd 1 non static variable of different data type,
access to print in main method */

class Program9
{
      public static char alpha = 'v';
	  public int a = 2;

	
	public static void main(String[] args) 
	{
		System.out.println(alpha);
		Program9 obj = new Program9();
		System.out.println(obj.a);


	}
}
