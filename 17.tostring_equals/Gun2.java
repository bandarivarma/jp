 class Gun2
{
	public String gunName; //camparision feature 
	public int bullets;//key feature;
	
	public Gun2(String gunName,int bullets)
	{
		this.gunName = gunName;
		this.bullets = bullets;
	}

	public String toString()
	{
		return ""+this.bullets;
	}

}