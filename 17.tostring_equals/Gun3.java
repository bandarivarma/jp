class Gun3
{
	public String gunName; //key feature;
	public int bullets;//camparision feature
	
	public Gun3(String gunName,int bullets)
	{
		this.gunName = gunName;
		this.bullets = bullets;
	}

	public String toString()
	{
		return "the most beautiful gun "+this.gunName+" has "+this.bullets+" bullets to fire";
	}

}