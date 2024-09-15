class Demo3 
{
	public Demo3(int a)
	{
		System.out.println("inside constructer int arg a : "+a);
	}
	public static void main(String[] args) 
	{
		Demo3 d1 = new Demo3(44);
		Demo3 d2 = new Demo3(43);
		Demo3 d3 = new Demo3(56);
		Demo3 d4 = new Demo3(67);
	}
}
