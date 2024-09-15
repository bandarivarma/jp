/* wap to create non static method and static method, create local variable of double datatype 
in non static method , boolean type in static method,print local variables in same method,
call the methods by main method? */

class Run2
{
	public void alphabets()
	{
		double height = 3.5;
		System.out.println(height);
		
	}

	public static void choose()
	{
		boolean answer = true;
		System.out.println(answer);
	}

	public static void main(String[] args) 
	{
		choose();
		Run2 r2 = new Run2();
		r2.alphabets();
	}
}
