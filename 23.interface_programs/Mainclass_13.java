import java.util.Scanner;
class Mainclass_13 
{
	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		Draw_13 d1 = new Draw_13();
		System.out.println("press 1 for the circle");
		System.out.println("press 2 for the circle");
		System.out.println("press 3 for the circle");
		
		System.out.println("enter your choice..");
		int choice = scan.nextInt();
		
		if(choice == 1)
		{
			System.out.println("enter the radius to find the area of the circle");
			int r = scan.nextInt();
			d1.display(new Circle_13(r));
		}
		if(choice == 2)
		{
			System.out.println("enter the dimension to find the area of the rectangle");
			System.out.println("enter length");
			int l = scan.nextInt();
			System.out.println("enter width");
			int w = scan.nextInt();
			d1.display(new Rect_13(l,w));
		}
		if(choice == 3)
		{
			System.out.println("enter the dimension to find the area of the Tri");
			System.out.println("enter base");
			double b = scan.nextInt();
			System.out.println("enter height");
			double h = scan.nextInt();
			d1.display(new Tri_13(b,h));
		}
		else
		
		{
			System.out.println("thankyou visit again");
		}


	}
}
