/*wap on static and non static methods...both called by main static method by creating a object*/

class  Demo5
{

	
	public static void pop()
	{
		System.out.println("iam coming");
	}

	
	public void popSinger()
	{
		System.out.println("we are going");
	}
		
	
	public static void main(String[] args) 
	{
		System.out.println("dont come ");
		Demo5 obj = new Demo5();
		pop();
		obj.popSinger();
		System.out.println("hey come man ");
	}


}
