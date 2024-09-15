/* calling the non static method by static method*/

class Sample3
{
	public static void main(String[] args) 
	{
		System.out.println(" where r u ");

		Sample3 obj = new Sample3();
		obj.jump();
		
		System.out.println("iam in the house");
	}

	public void jump()
	{
	System.out.println("iam in home");
	}

}
