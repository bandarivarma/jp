class Maintriangle 
{
	public static void main(String[] args) 
	{
		Triangle t1 = new Triangle(7,7.6);
		Triangle t2 = new Triangle(7,7.5);
		Triangle t3 = new Triangle(7,7.5);
		Triangle t4 = new Triangle(7,7.5);
		Triangle t5 = new Triangle(7,7.5);

		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());

		System.out.println(t2.equals(t4));//true
		System.out.println(t5.equals(t1));//false
		System.out.println(t2.equals(t3));//true



	}
}
