/*wap on 2 non static methods called by main static method by creating a object*/

class Test4
{
	
	public void flyShoot()
	{
		System.out.println(" shoot him ");
	}
	
	
	public void shootBullet()
	{
		System.out.println("shoot him with the bullet");
	}

	
	public static void main(String[] args) 
	{
		System.out.println("dont shoot him");
		Test4 obj = new Test4();
		obj.flyShoot();
		obj.shootBullet();
		System.out.println(" exactly shoot him");

	}
}
