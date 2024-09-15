class MainStudentdata2
{
	public static void main(String[] args) 
	{
		Studentdata me = new Studentdata(219,"verma",60.1);
		Studentdata myfriend1 = new Studentdata(220,"ramesh",70.1);
		Studentdata myfriend2 = new Studentdata(201,"sandeep",70.1);
		System.out.println(me); //toString method is very special method, bcoz it returns key feature of an object whenever Obj Ref var is printed. when obj ref var is printed,there is an implicit call to tostring() method
		System.out.println(myfriend1);
		System.out.println(myfriend2);
		System.out.println(me.equals(myfriend1));
		System.out.println(myfriend1.equals(myfriend2));
	}
}
