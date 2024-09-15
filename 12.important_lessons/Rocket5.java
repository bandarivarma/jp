class Rocket5 
{
	public int speed; //-->>here speed is non static variable present in an object,

	public Rocket5(int speed) //-->>here speed is not non static variable,it is argument.
	{
	 this.speed = speed;//-->>//--->>here values in arguments are goes to nonstatic variables in present in object.
						           /* to improve the readability of contructer,argument name will be similar to
							       non static variable name,
							       so constructer syntax : this.nonstatic variable name  = argument; */
								   //this'keyword use it only on non static variable and inside constructer.
	}
	public void move() 
	{
		System.out.println("rocket moves with the speed of the "+this.speed);
		/* non static method can access non static variable directly,
		but to improve the readability access non static variable using 'this' keyword,
		'this' keyword represents current object in execution */
		//'this' keyword also can be used inside nonstatic method.
	}
	public static void main(String[] args)
	{
		Rocket5 r1 = new Rocket5(240);
		Rocket5 r2 = new Rocket5(320);
		r1.move();
		r2.move();
	}
}
