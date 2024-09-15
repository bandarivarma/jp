class Maingun4 
{
	public static void main(String[] args) 
	{
		 Gun4 gun1 = new Gun4("AK47",110);
		 Gun4 gun2 = new Gun4("AWM",120);
		 String gun1output = gun1.toString();//it retuns AK47
		 String gun2output = gun2.toString();//it retuns pistol
		 System.out.println(gun1output);
		 System.out.println(gun2output);
		 boolean camparisionOutput = gun1.equals(gun2);
		 System.out.println(camparisionOutput);
	}
}

