// blue print of the car?

class Car3 
{	
	public String brand = "audi";
	public String series;//A4,A1
	public String colour;//RED,BLUE
	public int speed;//240,320	
	public int time;//2,4HRS

	public void findDistance()
	{
	 int distance = speed*time;
	 System.out.println(colour+" colour "+brand+" series "+series+" moving at the speed of "+speed+" km/hr for "+time+" hrs distance "+distance+" kms");
	}
	public static void main(String[] args) 
	{
		Car3 c1 = new Car3();
		Car3 c2 = new Car3();
		c1.series = "A4";
		c1.colour = "RED";
		c1.speed = 240;
		c1.time = 2;
		c2.series = "A1";
		c2.colour = "BLUE";
		c2.speed = 320;
		c2.time = 4;
		c1.findDistance();
		c2.findDistance();


	}
}
