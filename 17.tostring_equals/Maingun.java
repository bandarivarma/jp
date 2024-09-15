class Maingun 
{
	public static void main(String[] args) 
	{
		 Gun gun1 = new Gun("AK47",110);
		 Gun gun2 = new Gun("AWM",120);
		 String gun1output = gun1.toString();//it retuns AK47
		 String gun2output = gun2.toString();//it retuns pistol
		 System.out.println(gun1output);
		 System.out.println(gun2output);

	}
}
