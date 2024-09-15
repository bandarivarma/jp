class Maingun3 
{
	public static void main(String[] args) 
	{
		 Gun3 gun1 = new Gun3("AK47",110);
		 Gun3 gun2 = new Gun3("AWM",120);
		 String gun1output = gun1.toString();//it retuns AK47
		 String gun2output = gun2.toString();//it retuns pistol
		 System.out.println(gun1output);
		 System.out.println(gun2output);

	}
}
