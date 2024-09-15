class Sample//a class allows you to create only one object at one point of time is called single ton

{
	private static Sample sample = null;

	private Sample()
	{
		System.out.println("in constructer");
	}
	public static Sample get()
	{
		if(sample == null)
		{
			sample = new Sample();
		}
		return sample;
	
	}
}

class Mainclass
 
{
	public static void main(String[] args) 
	{
		Sample s1 = Sample.get();
		Sample s2 = Sample.get();
		Sample s3 = Sample.get();
	}

}  


