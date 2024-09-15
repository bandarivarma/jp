import java.util.Scanner;
class Demo3
{
	public static void main(String[] args) 
	{
		System.out.println("main start..");
		Scanner scan = new Scanner(System.in);
	    System.out.println("enter first number");
		int a = scan.nextInt();
	    System.out.println("enter second number");
		int b = scan.nextInt();
		try
		{
			System.out.println(a/b);
		}
		catch (ArithmeticException e1)
		{
			System.out.println("Denominater cant be zero.....reenter the value");
			b = scan.nextInt();
			try
			{
				System.out.println(a/b);
			}
			catch (ArithmeticException e2)
			{
				System.out.println("re attempt failed...program will be terminated");
			}
		
		}
		System.out.println("main ends...");	
	}
}
