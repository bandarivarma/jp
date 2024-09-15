class Gun4
{
	public String gunName; //key feature;
	public int bullets;//camparision feature
	
	public Gun4(String gunName,int bullets)
	{
		this.gunName = gunName;
		this.bullets = bullets;
	}

	public String toString()
	{
		return "gun name is : "+this.gunName; 
	}

	public boolean equals(Object obj)
	{
		if (obj instanceof Gun4)
		{
			Gun4 gun = (Gun4)obj;
			return this.bullets == gun.bullets;
		}
		else
		{
			return false;
		}
	}

} 
