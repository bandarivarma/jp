import java.util.Scanner;

class MainALDCC

{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to the circus show");
		System.out.println("press 1 for the Lion sound");
		System.out.println("press 2 for the Dog sound");
		System.out.println("press 3 for the Cat sound");
		System.out.println("enter your choice");
		int choice = scan.nextInt();
		
		if (choice == 1)
		{
			Circus.makeSound(new Lion());
		}
		else if (choice == 2)
		{
			Circus.makeSound(new Dog());
		}
		else if (choice == 3)
		{
			Circus.makeSound(new Cat());
		}
		else
		{
			System.out.println("invalid choice");
		}
		


	}
}
