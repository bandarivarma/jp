class Mainstudentdata 
{
	public static void main(String[] args) 
	{
		Studentdata me = new Studentdata(219,"verma",60.1);
		Studentdata myfriend1 = new Studentdata(220,"ramesh",70.1);
		Studentdata myfriend2 = new Studentdata(201,"sandeep",70.1);
		String meOutput = me.toString();//or instead ofthese all data we can aslo print directly by calling the method with an object--->System.out.println(me.toString()); 
		String myfriend1Output = myfriend1.toString();																					//System.out.println(myfriend1.toString());
		String myfriend2Output = myfriend2.toString();																					//System.out.println(myfriend2.toString());
		System.out.println(meOutput);
		System.out.println(myfriend1Output);
		System.out.println(myfriend2Output);
		boolean campareOut1 = me.equals(myfriend1);//or System.out.println(me.equals(myfriend1)); here me object called the equals method
		boolean campareOut2 = myfriend1.equals(myfriend2);//or System.out.println(myfriend1.equals(myfriend2));
		System.out.println(campareOut1);
		System.out.println(campareOut2);
	}
}
