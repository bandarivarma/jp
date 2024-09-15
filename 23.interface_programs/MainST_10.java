//perform single level inheritance using interface and implementaton and apply upcasing

interface S
{
	 public void success();
}
class T implements S
{
	 public void success()
	{
		System.out.println("sucess is not fullstop,rather it's a coma");
	
	}


}

class MainST_10
{
	public static void main(String[] args) 
	{
		S s = new T();
		s.success();
	}
}
