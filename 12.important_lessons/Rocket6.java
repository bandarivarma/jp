class Rocket6
{
	public int speed;

	public Rocket6(int speed)
	{
	 this.speed = speed;  //--->> 'this'keyword use it only on non static variable and inside constructer
	}
	public void move() 
	{
		System.out.println("rocket moves with the speed of the "+this.speed);
		/* non static method can access non static variable directly,
		but to improve the readability access non static variable using 'this' keyword,
		'this' keyword represents current object in execution .....
		'this' keyword also can be used inside nonstatic method*/
	}
	public static void main(String[] args)
	{
		Rocket6 r1 = new Rocket6(240);
		Rocket6 r2 = new Rocket6(320);
		r1.move();
		r2.move();
	}
}
