class MainMNO
{
	public static void main(String[] args) 
	{
		M m1 = (M)new N();
		System.out.println(m1.j);
		N n1 = (N)m1;
		System.out.println(n1.k);
		System.out.println(n1.j);
		System.out.println();
		M m2 = (M)new O();
		System.out.println(m2.j);
		O o1 = (O)m2;
		System.out.println(o1.l);
		System.out.println(o1.j);



	}
}
