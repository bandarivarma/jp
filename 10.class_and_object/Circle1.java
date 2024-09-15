 /* create a blue print for the circle using class*/

class Circle1 
{
	public static double pi = 3.14;   //always initialize the static variable
	public int radius;   // initialize non static variable only after object creation

	public void findArea() /*declare it as nonstatic method because operation of method depends or uses on nonstatic varible*/
	{
		double area = pi*radius*radius; //purpose of local variable(area) is to hold results of opertion
		System.out.println("area of circle : "+area);
	}

	public static void main(String[] args)  //note 
	{										// BLUE PRINT NAME : CIRCLE
		Circle1 b1 = new Circle1 ();		// PI : DOUBLE ----------->>>>>>>>>>> static
		Circle1 b2 = new Circle1 ();		//RADIUS : INT----------->>>>>>>>>>> non static
		Circle1 b3 = new Circle1 ();		// FIND AREA() : VOID(method)-------->>>>>non static---->>>declare it as nonstatic method because operation of method depends or uses on nonstatic varible
		Circle1 b4 = new Circle1 ();		// MAIN(STRING[] args): VOID(method) ------->>>>static
			b1.radius = 1;
			b2.radius = 1;
			b3.radius = 1;
			b4.radius = 1;
			b1.findArea();
			b2.findArea();
			b3.findArea();
			b4.findArea();
	}
}
