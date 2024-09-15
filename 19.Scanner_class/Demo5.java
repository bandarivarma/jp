import java.util.Scanner;
class Demo5 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String string = scan.nextLine();
		System.out.println("enter the index");
		int index = scan.nextInt();
		
		try
		{
			char ch = string.charAt(index);
			System.out.println("character ch : "+ch+" is present at the index : "+index );		
		}
		catch (StringIndexOutOfBoundsException e1)
		{
			System.out.println("last attemped has been failed...renter the index" );
			
			index = scan.nextInt();
			try
			{
				char ch = string.charAt(index);
				System.out.println("character ch : "+ch+" is present at the index : "+index );		

			}
			catch (StringIndexOutOfBoundsException e2)
			{
				System.out.println(" again last attemped has been failed...program will be terminated" );

			}


		}	
		
	}
}
