class JspStudent9
{	
	public String name;
	public char gender;
	public String stream;
	public int yop;
	public double tenth;
	public double inter;
	public double degree;
	public String javaTrainerName;

	public JspStudent9(String name,char gender ,String stream,int yop,double tenth,double inter,double degree,String javaTrainerName)
	{
		this.name = name;
		this.gender = gender;
		this.stream = stream;
		this.yop = yop;
		this.tenth = tenth;
		this.inter = tenth;
		this.degree = degree;
		this.javaTrainerName = javaTrainerName;
	}

	public void jump() 
	{
		System.out.println("my name is "+this.name);
		System.out.println("my gender is "+this.gender);
		System.out.println("my stream is "+this.stream);
		System.out.println("my year of pass is "+this.yop);
		System.out.println("my marks are "+this.tenth);
		System.out.println("my marks are "+this.inter);
		System.out.println("my marks are "+this.degree);
		System.out.println("my java trainer name "+this.javaTrainerName);
		System.out.println();
	}
	
	public static void main(String[] args)
	{
	JspStudent9 j1 = new JspStudent9("varma",'m',"eee",2020,10.10,10.10,10.10,"sunil");	
	JspStudent9 j2 = new JspStudent9("dinesg",'m',"eee",2019,10.9,10.9,10.9,"sunil");	
	JspStudent9 j3 = new JspStudent9("sandeep",'m',"eee",2018,10.8,10.9,10.7,"sunil");
	j1.jump();
	j2.jump();
	j3.jump();

	}//above program is according to imp lessons...but this is actual way
}
