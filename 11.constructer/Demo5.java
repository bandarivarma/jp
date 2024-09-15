class Demo5 
{
	public String name;//--> here non static variables are present in the object
	public int a;

	public Demo5(String name , int a)//---->> here name and a are not non static variables ,they are arguments
	{		
								
		 this.name = name; //--->>here values in arguments are goes to nonstatic variables in present in object.
		 this.a = a;       /* to improve the readability of contructer,argument name will be similar to
							non static variable name,
							so constructer syntax : this.nonstatic variable name  = argument; */
	}

	public void go()
	{
	 System.out.println(this.name+" got "+this.a+" marks in java" );
	}

	public static void main(String[] args) 
	{
		Demo5 d1 = new Demo5("verma",99);
		Demo5 d2 = new Demo5("dinesh",100);
		Demo5 d3 = new Demo5("sandeep",98);
		d1.go();
		d2.go();
		d3.go();
		
	}						//above program is according to imp lessons...but this is actual way
}
