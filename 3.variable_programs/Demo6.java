 /* wap to create non static variable of different data type and access to print in main method*/

class  Demo6
{
	public char alpha = 'j';
	public String name = "verma";


	public static void main(String[] args) 
	{
		Demo6 obj = new Demo6();
		System.out.println(obj.alpha);
		System.out.println(obj.name);
	}
}
