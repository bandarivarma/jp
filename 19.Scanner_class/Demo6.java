import java.util.Scanner;
class Demo6
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String string = scan.nextLine();
		System.out.println("enter the index");
		int index = scan.nextInt();
		for (int chance = 4;chance>=1;chance-- )
		{
			try
			{
				char ch = string.charAt(index);
				System.out.println("character ch : "+ch+" is present at the index : "+index );
				break;
			}
			catch (StringIndexOutOfBoundsException e1)
			{
				if (chance==1)
				{
					System.out.println("your last attempt has been failed...program will be terminated");
				}
				else
				{
					System.out.println("you have "+(chance-1)+" attempts left");
					System.out.println("re enter the index");
					index = scan.nextInt();

				}

			}
		}
	}
}