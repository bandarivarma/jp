import java.util.Scanner;
class Demo2 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("what is your name");
		String string = scan.nextLine();
		System.out.println("what is your age");
		int age = scan.nextInt();
		System.out.println("what is your height");
		double height = scan.nextDouble();
		System.out.println("what is your education status");
		boolean educationstatus = scan.nextBoolean();
		System.out.println("what is your gender");
		char gender = scan.next().charAt(0);
		System.out.println(string);
		System.out.println(age);
		System.out.println(height);
		System.out.println(educationstatus);
		System.out.println(gender);







	}
}
