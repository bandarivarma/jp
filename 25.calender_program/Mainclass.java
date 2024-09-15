class  Calendar
{
	private int monthNumber;

	public Calendar(int monthNumber)
	{
		if((monthNumber >= 1) && (monthNumber <= 12))
		{
			this.monthNumber = monthNumber;
		}
		else
		{
			throw new InvalidMonthNumberException();
		}
	}
	
	public void updateMonthNumber(int monthNumber)
	{
		if((monthNumber >= 1) && (monthNumber <= 12))
		{
			this.monthNumber = monthNumber;
		}
		else
		{
			throw new InvalidMonthNumberException();
		}
	}

	public void showMonthNumber()
	{
		System.out.println("current month Number is : "+this.monthNumber);
	}
}

class InvalidMonthNumberException extends RuntimeException
{
	public String toString()
	{
		return " given number is not between 1 to 12";
	}
}
class Mainclass 
{
	public static void main(String[] args) 
	{
			Calendar c1 = new Calendar(11);
			c1.showMonthNumber();
			
			System.out.println("updated month number");
			c1.updateMonthNumber(12);
			c1.showMonthNumber();

	}
}

