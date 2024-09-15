class  Demo
{    
     public static void test()
	{
		 int k = 34; /*local variable test method*/
		System.out.println(k);
	}

	public static void main(String[] args) 
	{
		int i = 22; /* local variable main method*/
		System.out.println(i);
		test();
	}
}
