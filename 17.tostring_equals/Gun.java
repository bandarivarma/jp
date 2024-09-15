class Gun
{
	public String gunName; //key feature;
	public int bullets;//camparision feature
	
	public Gun(String gunName,int bullets)
	{
		this.gunName = gunName;
		this.bullets = bullets;
	}

	public String toString()
	{
		return this.gunName;
	}

}