class  Car8
{
	public String brand = "audi";
	public String series;//A4,A1
	public String colour;//RED,BLUE
	public int speed;//240,320	
	public int time;//2,4HRS
	
	public Car8(String series ,String colour,int speed, int time)
	{
		this.series = series;
		this.colour = colour;
		this.speed = speed;
		this.time = time;
	}
	
	public void jump()
	{
	  int distance = this.speed*this.time;
	  System.out.println(this.colour+" colour "+brand+" series "+this.series+" moving at the speed of "+this.speed+" km/hr for "+this.time+" hrs distance "+distance+" kms");
	  System.out.println();
	}
	public static void main(String[] args) 
	{
	 Car8 c1 = new Car8("A4","RED",240,2);
	 Car8 c2 = new Car8("A1","blue",320,4);
	 c1.jump();
	 c2.jump();
	}//above program is according to imp lessons...but this is actual way
}
