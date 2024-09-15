class  Rocket
{
	public int speed;

	public Rocket4(int a)
	{
	 speed = a;
	}
	public void move() 
	{
		System.out.println("rocket moves with the speed of the "+this.speed);
		/* non static method can access non static variable directly,
		but to improve the readability access non static variable using 'this' keyword,
		'this' keyword represents current object in execution */
	}
	public static void main(String[] args)
	{
		Rocket4 r1 = new Rocket4(240);
		Rocket4 r2 = new Rocket4(320);
		r1.move();
		r2.move();
	}
}
