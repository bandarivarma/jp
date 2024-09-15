import java.util.Scanner;
class Demo4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	    System.out.println("enter first number");
		int a = scan.nextInt();
	    System.out.println("enter second number");
		int b = scan.nextInt();
		for (int chance =4;chance>=1;chance--)
		{
			try
			{
				System.out.println(a/b);
				System.out.println("division is successfull");


			}
			catch (ArithmeticException e1)
			{
				if (chance==1)
				{
					System.out.println("last attempt has failed, division is unsuccessfull,program willbe terminated");
				
				}
				else
				{
					System.out.println("denominater cant be zero");
					System.out.println("you have "+(chance-1)+" attempts left");
					System.out.println("re enter the denominater");
					b = scan.nextInt();


				}
			}
		}
		
	}
}
