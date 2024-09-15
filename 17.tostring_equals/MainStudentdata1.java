class MainStudentdata1
{
	public static void main(String[] args) 
	{
		Studentdata me = new Studentdata(219,"verma",60.1);
		Studentdata myfriend1 = new Studentdata(220,"ramesh",70.1);
		Studentdata myfriend2 = new Studentdata(201,"sandeep",70.1);
		System.out.println(me.toString()); 
		System.out.println(myfriend1.toString());
		System.out.println(myfriend2.toString());
		System.out.println(me.equals(myfriend1));
		System.out.println(myfriend1.equals(myfriend2));
	}
}
