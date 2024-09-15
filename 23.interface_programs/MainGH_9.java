//perform single level inheritance using abstract class and apply upcasting

abstract class G
{
	abstract public void reach();
}
class H extends G
{
	 public void reach()
	{
		System.out.println("reach the railway station in 5min");
	
	}


}

class MainGH_9
{
	public static void main(String[] args) 
	{
		G g = new H();
		g.reach();
	}
}
