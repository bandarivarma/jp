import java.util.Scanner;
class  Demo1
{
	public static void main(String[] args) 
	{
		//create scanner object and provide system console location for inputing data
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name");
		String s1 = scan.nextLine();// enter raja rao as a name it will print only raja rao as it is
		System.out.println(s1);

	}
}
