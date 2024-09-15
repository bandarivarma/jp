class  Studentdata
{
	public int StudentID;//key feature
	public String Studentname;//key feature
	public double Studentpercentage;//comparision feature

	public Studentdata(int StudentID, String Studentname, double Studentpercentage)
	{
		this.StudentID = StudentID;
		this.Studentname = Studentname;
		this.Studentpercentage = Studentpercentage;
	}
	
	public String toString()
	{
		return "my id "+this.StudentID+" and my name is "+this.Studentname;
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof Studentdata)
		{
			Studentdata s1 = (Studentdata)obj;
			return this.Studentpercentage == s1.Studentpercentage;
		}
		else
		{
			return false; /*in place of return actually exception topic program will come
							but just for understanding purpose we written return*/
		}
	}	
	
	
}
