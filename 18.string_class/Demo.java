class Demo
{
	public static void main(String[] args) 
	{
		String s1 = new String("hi verma");
		String s2 = new String("hi verma");
		String s3 = new String("hi ramesh");
		System.out.println(s1);// or (s1.toString)
		System.out.println(s2);// or (s2.toString)
		System.out.println(s3);// or (s3.toString)
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));

	}
}
